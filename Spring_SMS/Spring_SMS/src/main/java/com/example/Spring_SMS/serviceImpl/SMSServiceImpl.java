package com.example.Spring_SMS.serviceImpl;

import com.example.Spring_SMS_Twilio.dto.SmsRequestDTO;
import com.example.Spring_SMS_Twilio.response.ApiResponseDTO;
import com.example.Spring_SMS_Twilio.service.SMSService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SMSServiceImpl implements SMSService {

    @Value("${twilio.phone.number}")
    private String twilioPhoneNumber;
    @Override
    public ApiResponseDTO sendSMS(SmsRequestDTO request) {

        try {

            Message message = Message.creator(
                    new PhoneNumber(request.getPhoneNumber()),
                    new PhoneNumber(twilioPhoneNumber),
                    request.getMessage()
            ).create();

            return ApiResponseDTO.builder()
                    .success(true)
                    .message("SMS sent successfully.")
                    .data(message.getSid())
                    .build();

        } catch (Exception e) {
            throw new SMSException("Failed to send SMS: " + e.getMessage());
        }
    }
}