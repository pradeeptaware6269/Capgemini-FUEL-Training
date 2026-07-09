package com.example.Spring_E_Com.serviceImpl;
import com.example.Spring_E_Com.dto.auth.Request.LoginRequestDTO;
import com.example.Spring_E_Com.dto.auth.Request.RegisterRequestDTO;
import com.example.Spring_E_Com.dto.auth.Responce.LoginResponseDTO;
import com.example.Spring_E_Com.dto.auth.Responce.RegisterResponceDTO;
import com.example.Spring_E_Com.exception.RoleNotFoundException;
import com.example.Spring_E_Com.exception.UserNotFoundException;
import com.example.Spring_E_Com.model.Role;
import com.example.Spring_E_Com.model.User;
import com.example.Spring_E_Com.repository.RoleRepository;
import com.example.Spring_E_Com.repository.UserRepository;
import com.example.Spring_E_Com.role.RoleName;
import com.example.Spring_E_Com.service.Auth_Service;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class Auth_ServiceImpl implements Auth_Service {


    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final EmailServiceImpl emailService;


    @Override
    public RegisterResponceDTO register(RegisterRequestDTO registerRequestDTO) {

        registerRequestDTO.setPassword(registerRequestDTO.getPassword().trim());

        User user = modelMapper.map(registerRequestDTO, User.class);

        user.setPassword(passwordEncoder.encode(registerRequestDTO.getPassword()));

        Role customerRole = roleRepository.findByName(RoleName.CUSTOMER.name())
                .orElseThrow(() -> new RoleNotFoundException("Customer not found"));

        user.setRole(customerRole);

        User saveRegistration = userRepository.save(user);

        emailService.sendRegisterEmail(saveRegistration.getEmail(),saveRegistration.getFirstName());

        return modelMapper.map(saveRegistration, RegisterResponceDTO.class);
    }

    @Override
    public RegisterResponceDTO getRegisterData(String email)
    {
        Optional<User> user = userRepository.findByEmail(email);
        RegisterResponceDTO dto=modelMapper.map(user,RegisterResponceDTO.class);
        return dto;
    }


    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {

        User user = userRepository.findByEmail(loginRequestDTO.getEmail())
                .orElseThrow(() -> new UserNotFoundException("Sorry Invalid Email --- user not found "));
        if (!passwordEncoder.matches(loginRequestDTO.getPassword(), user.getPassword()))
        {
            throw new UserNotFoundException("sorry invalid password   --- please try agian --- ");
        }

        LoginResponseDTO response = new LoginResponseDTO();
        response.setEmail(user.getEmail());
        response.setPassword(user.getPassword());
        response.setRole(user.getRole().getName());

        emailService.sendLoginEmail(response.getEmail(), response.getRole());

        return response;
    }


    @Override
    public String deleteUser(Long id) {

        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found Here "));
        userRepository.delete(user);
        return " ------ User Deleted Successfully --------  : "+id;
    }




    @Override
    public RegisterResponceDTO updateUser(Long id, RegisterRequestDTO dto) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));


        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());

        if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
            user.setPassword(passwordEncoder.encode(dto.getPassword().trim()));
        }

        User updatedUser = userRepository.save(user);

        return modelMapper.map(updatedUser, RegisterResponceDTO.class);
    }

    // for feching the all data
    @Override
    public List<User> getAllCustomers() {
        return userRepository.findAll();
    }

}