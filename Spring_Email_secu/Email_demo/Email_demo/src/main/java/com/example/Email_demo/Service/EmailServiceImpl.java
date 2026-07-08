package com.example.Email_demo.Service;

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

        // Recipient Email
        message.setTo(to);

        // Email Subject
        message.setSubject("Welcome To Ecommerce");

        // Email Body
        message.setText(
                "Hello " + name + ",\n\n" +
                        "Welcome to our Ecommerce Application!\n\n" +
                        "Your account has been created successfully.\n\n" +
                        "Thank you for registering.\n\n" +
                        "Regards,\n" +
                        "Ecommerce Team"

        );

        // Send Email
        mailSender.send(message);
    }
}