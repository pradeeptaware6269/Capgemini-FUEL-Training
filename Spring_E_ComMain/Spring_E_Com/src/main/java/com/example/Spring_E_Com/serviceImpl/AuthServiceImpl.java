package com.example.Spring_E_Com.serviceImpl;


import com.example.Spring_E_Com.constants.AppConstant;
import com.example.Spring_E_Com.dto.auth.AuthResponseDTO;
import com.example.Spring_E_Com.dto.auth.LoginRequestDTO;
import com.example.Spring_E_Com.dto.auth.RegisterRequestDTO;
import com.example.Spring_E_Com.exception.ResourceNotFoundException;
import com.example.Spring_E_Com.model.Role;
import com.example.Spring_E_Com.model.User;
import com.example.Spring_E_Com.repository.RoleRepository;
import com.example.Spring_E_Com.repository.UserRepository;
import com.example.Spring_E_Com.role.RoleName;
import com.example.Spring_E_Com.service.Auth_Service;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class AuthServiceImpl implements Auth_Service {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final EmailServiceImpl emailService;
    private final AppConstant appConstant;

    @Override
    public AuthResponseDTO register(RegisterRequestDTO registerRequestDTO) {

        String firstName = registerRequestDTO.getFirstName().trim();
        String lastName = registerRequestDTO.getLastName().trim();
        String email = registerRequestDTO.getEmail().trim().toLowerCase();
        String password = registerRequestDTO.getPassword().trim();
        String phone = registerRequestDTO.getPhone().trim();

        registerRequestDTO.setFirstName(firstName);
        registerRequestDTO.setLastName(lastName);
        registerRequestDTO.setEmail(email);
        registerRequestDTO.setPassword(password);
        registerRequestDTO.setPhone(phone);

        if (userRepository.existsByEmail(email)) {
            throw new ResourceNotFoundException("Email already exists.");
        }

        User user = modelMapper.map(registerRequestDTO, User.class);

        user.setPassword(passwordEncoder.encode(password));

        Role customerRole = roleRepository.findByName(RoleName.CUSTOMER.name())
                .orElseThrow(() -> new ResourceNotFoundException("  "));

        user.setRole(customerRole);


        User savedUser = userRepository.save(user);


        emailService.sendRegisterEmail(
                savedUser.getEmail(),
                savedUser.getFirstName()
        );


        return modelMapper.map(savedUser, AuthResponseDTO.class);
    }



    @Override
    public AuthResponseDTO login(LoginRequestDTO loginRequestDTO) {

        User user = userRepository.findByEmail(loginRequestDTO.getEmail().trim().toLowerCase())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Invalid email. User not found."));

        if (!passwordEncoder.matches(loginRequestDTO.getPassword().trim(), user.getPassword())) {
            throw new ResourceNotFoundException("Invalid password.");
        }

        AuthResponseDTO response = new AuthResponseDTO();
        response.setEmail(user.getEmail());
        response.setRole(user.getRole().getName());

        emailService.sendLoginEmail(
                user.getEmail(),
                user.getFirstName()
        );

        return response;
    }

}