package com.example.Spring_E_Com.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
@RequiredArgsConstructor
public class EmailController
{

//    @PostMapping("/send")
//    public String sendMail() {
//
//        emailService.sendWelcomeEmail(
//                "enter the mail here ",
//                "  enter name here "
//        );
//
//        return "Mail Sent Successfully";
//    }
}