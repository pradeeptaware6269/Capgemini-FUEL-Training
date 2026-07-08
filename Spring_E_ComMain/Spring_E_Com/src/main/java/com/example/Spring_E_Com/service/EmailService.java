package com.example.Spring_E_Com.service;

public interface EmailService {
    void sendRegisterEmail(String to,String name);

    void sendLoginEmail(String to,String role);
}
