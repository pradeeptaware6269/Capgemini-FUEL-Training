package com.example.Spring_E_Com.serviceImpl;


import com.example.Spring_E_Com.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    @Override
    public void sendWelcomeEmail(String to, String name) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(to);
        message.setSubject("Welcome to E-Commerce");

        message.setText("""
                Hello %s,

                Welcome to our E-Commerce Application.

                Your account has been created successfully.

                Thank you for registering.

                Regards,
                
                E-Commerce Team
                """.formatted(name));

        mailSender.send(message);
    }
}