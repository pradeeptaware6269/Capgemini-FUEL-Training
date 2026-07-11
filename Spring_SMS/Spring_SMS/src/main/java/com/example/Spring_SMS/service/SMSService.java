package com.example.Spring_SMS.service;


import com.example.Spring_SMS_Twilio.dto.SmsRequestDTO;
import com.example.Spring_SMS_Twilio.response.ApiResponseDTO;

public interface SMSService {

    ApiResponseDTO sendSMS(SmsRequestDTO request);

}