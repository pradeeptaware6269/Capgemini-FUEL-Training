package com.example.Spring_Email_Security.dto.auth.Request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {

    private String email;
    private String password;

    public LoginRequestDTO()
    {

    }
}
