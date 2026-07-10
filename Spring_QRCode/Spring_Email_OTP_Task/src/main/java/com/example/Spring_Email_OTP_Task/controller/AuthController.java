package com.example.Spring_Email_OTP_Task.controller;

import com.example.Spring_Email_OTP_Task.dto.ApiResponseDTO;

import com.example.Spring_Email_OTP_Task.dto.SendOTPRequestDTO;
import com.example.Spring_Email_OTP_Task.dto.VerifyOtpRequestDTO;
import com.example.Spring_Email_OTP_Task.model.User;
import com.example.Spring_Email_OTP_Task.repository.UserRepository;
import com.example.Spring_Email_OTP_Task.service.EmailOTPService;
import com.example.Spring_Email_OTP_Task.serviceImpl.QRCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final EmailOTPService emailOTPService;
    private final UserRepository userRepository;

    @PostMapping("/send-otp")
    public ApiResponseDTO sendOTP(@RequestBody SendOTPRequestDTO dto) {

        return emailOTPService.sendOTP(dto);

    }

    @PostMapping("/verify-otp")
    public ApiResponseDTO verifyOTP(@RequestBody VerifyOtpRequestDTO dto) {

        return emailOTPService.verifyOTP(dto);

    }
    @GetMapping("/verify/{id}")
    public ResponseEntity<?> verifyUser(@PathVariable Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        if (Boolean.TRUE.equals(user.getIsVerified())) {

            return ResponseEntity.ok(
                    "User Verified\n\n" +
                            "Name : " + user.getName() +
                            "\nEmail : " + user.getEmail()
            );
        }

        return ResponseEntity.badRequest().body("User Not Verified");
    }

    private final QRCodeService qrCodeService;

    @GetMapping("/{id}/qr")
    public ResponseEntity<byte[]> generateQR(@PathVariable Long id) throws Exception {

        byte[] qr = qrCodeService.generateQRCode(id);

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(qr);
    }

}