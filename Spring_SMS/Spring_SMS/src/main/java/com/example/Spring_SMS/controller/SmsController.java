package com.example.Spring_SMS.controller;

import com.example.Spring_SMS_Twilio.dto.SmsRequestDTO;
import com.example.Spring_SMS_Twilio.response.ApiResponseDTO;
import com.example.Spring_SMS_Twilio.service.SMSService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms")
@RequiredArgsConstructor
public class SMSController {

    private final SMSService smsService;

    @PostMapping("/send")
    public ResponseEntity<ApiResponseDTO> sendSMS(
            @Valid @RequestBody SmsRequestDTO request) {

        ApiResponseDTO response = smsService.sendSMS(request);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}