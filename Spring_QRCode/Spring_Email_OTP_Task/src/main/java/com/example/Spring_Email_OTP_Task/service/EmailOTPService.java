package com.example.Spring_Email_OTP_Task.service;

import com.example.Spring_Email_OTP_Task.dto.ApiResponseDTO;
import com.example.Spring_Email_OTP_Task.dto.SendOTPRequestDTO;
import com.example.Spring_Email_OTP_Task.dto.VerifyOtpRequestDTO;

public interface EmailOTPService {

    ApiResponseDTO sendOTP(SendOTPRequestDTO dto);

    ApiResponseDTO verifyOTP(VerifyOtpRequestDTO dto);
}