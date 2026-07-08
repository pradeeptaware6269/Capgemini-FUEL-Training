package com.example.Spring_E_Com.controller;

import com.example.Spring_E_Com.serviceImpl.EmailServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
@RequiredArgsConstructor
public class EmailController {

    private final EmailServiceImpl emailService;


    @PostMapping("/send")
    public String sendMail() {

        emailService.sendWelcomeEmail(
                "aditijadhav1032004@gmail.com",
                "Adi Jadhav"
        );

        return "Mail Sent Successfully";
    }
}