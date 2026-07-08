package com.example.Email_demo.Service;

import com.example.Email_demo.DTO.RegisterRequestDTO;
import com.example.Email_demo.DTO.RegisterResponseDTO;
import com.example.Email_demo.Model.User;
import com.example.Email_demo.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;
    @Override
    public RegisterResponseDTO register(RegisterRequestDTO request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists.");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        User savedUser = userRepository.save(user);

        emailService.sendWelcomeEmail(savedUser.getEmail(), savedUser.getName());

        return new RegisterResponseDTO(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                "User Registered Successfully"
        );
    }
}