package com.example.Email_demo.Service;

import com.example.Email_demo.DTO.RegisterRequestDTO;
import com.example.Email_demo.DTO.RegisterResponseDTO;

public interface AuthService {

    RegisterResponseDTO register(RegisterRequestDTO request);

}