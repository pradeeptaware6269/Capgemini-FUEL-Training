package com.example.Spring_Email_OTP_Task.serviceImpl;

import com.example.Spring_Email_OTP_Task.model.User;
import com.example.Spring_Email_OTP_Task.repository.UserRepository;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
@RequiredArgsConstructor
public class QRCodeService {

    private final UserRepository userRepository;

    public byte[] generateQRCode(Long id) throws Exception {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        if (!user.getIsVerified()) {
            throw new RuntimeException("Email not verified");
        }

        String qrData = "http://192.168.1.11:8080/api/auth/verify/" + id;

        BitMatrix matrix = new MultiFormatWriter().encode(
                qrData,
                BarcodeFormat.QR_CODE,
                300,
                300
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        MatrixToImageWriter.writeToStream(matrix, "PNG", out);

        return out.toByteArray();
    }
}