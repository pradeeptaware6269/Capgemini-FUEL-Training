package com.example.Spring_Email_OTP_Task.serviceImpl;

import com.example.Spring_Email_OTP_Task.dto.ApiResponseDTO;
import com.example.Spring_Email_OTP_Task.dto.SendOTPRequestDTO;
import com.example.Spring_Email_OTP_Task.dto.VerifyOtpRequestDTO;
import com.example.Spring_Email_OTP_Task.model.User;
import com.example.Spring_Email_OTP_Task.repository.UserRepository;
import com.example.Spring_Email_OTP_Task.service.EmailOTPService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.time.LocalDateTime;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class EmailOTPServiceImpl implements EmailOTPService {

    @Autowired
    private JavaMailSender mailSender;
    private final UserRepository userRepository;

    @Override
    public ApiResponseDTO sendOTP(SendOTPRequestDTO dto) {

        String email = dto.getEmail().trim().toLowerCase();

        User user = userRepository.findByEmail(email)
                .orElse(new User());

        String otp = String.format("%06d", new Random().nextInt(1000000));

        user.setName(dto.getName());
        user.setEmail(email);
        user.setPassword(dto.getPassword());
        user.setOtp(otp);
        user.setOtpExpiryTime(LocalDateTime.now().plusMinutes(5));
        user.setIsVerified(false);

        userRepository.save(user);

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(email);
        message.setSubject("Email Verification OTP");
        message.setText(
                "Hello " + dto.getName() +
                        "\n\nYour OTP is : " + otp +
                        "\n\nValid for 5 minutes."
        );


        mailSender.send(message);

        return new ApiResponseDTO(true, "OTP Sent Successfully");
    }

    @Override
    public ApiResponseDTO verifyOTP(VerifyOtpRequestDTO dto) {

        String email = dto.getEmail().trim().toLowerCase();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (user.getOtp() == null) {
            return new ApiResponseDTO(false, "No OTP generated");
        }

        if (user.getOtpExpiryTime() == null) {
            return new ApiResponseDTO(false, "OTP Expiry not found");
        }

        if (LocalDateTime.now().isAfter(user.getOtpExpiryTime())) {
            return new ApiResponseDTO(false, "OTP Expired");
        }

        if (!user.getOtp().equals(dto.getOtp())) {
            return new ApiResponseDTO(false, "Invalid OTP");
        }

        user.setIsVerified(true);
        user.setOtp(null);
        user.setOtpExpiryTime(null);

        userRepository.save(user);

        return new ApiResponseDTO(true, "Email Verified Successfully");
    }
}