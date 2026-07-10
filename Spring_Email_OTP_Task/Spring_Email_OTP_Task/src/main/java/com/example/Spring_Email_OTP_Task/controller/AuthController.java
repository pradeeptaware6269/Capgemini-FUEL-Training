package com.example.Spring_Email_OTP_Task.controller;

import com.example.Spring_Email_OTP_Task.dto.ApiResponseDTO;

import com.example.Spring_Email_OTP_Task.dto.SendOTPRequestDTO;
import com.example.Spring_Email_OTP_Task.dto.VerifyOtpRequestDTO;
import com.example.Spring_Email_OTP_Task.service.EmailOTPService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final EmailOTPService emailOTPService;

    @PostMapping("/send-otp")
    public ApiResponseDTO sendOTP(@RequestBody SendOTPRequestDTO dto) {

        return emailOTPService.sendOTP(dto);

    }

    @PostMapping("/verify-otp")
    public ApiResponseDTO verifyOTP(@RequestBody VerifyOtpRequestDTO dto) {

        return emailOTPService.verifyOTP(dto);

    }
}