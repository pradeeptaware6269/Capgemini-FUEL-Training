package com.example.Spring_Email_Security.service;

import com.example.Spring_Email_Security.dto.auth.Request.LoginRequestDTO;
import com.example.Spring_Email_Security.dto.auth.Request.RegisterRequestDTO;
import com.example.Spring_Email_Security.dto.auth.Responce.LoginResponseDTO;
import com.example.Spring_Email_Security.dto.auth.Responce.RegisterResponceDTO;
import com.example.Spring_Email_Security.model.User;

import java.util.List;

public interface Auth_Service {


    RegisterResponceDTO register(RegisterRequestDTO registerRequestDTO);

    LoginResponseDTO login(LoginRequestDTO loginRequestDTO);

    RegisterResponceDTO updateUser(Long id, RegisterRequestDTO dto);

    RegisterResponceDTO getRegisterData(String email);
    List<User> getAllCustomers();

    String deleteUser(Long id);
}