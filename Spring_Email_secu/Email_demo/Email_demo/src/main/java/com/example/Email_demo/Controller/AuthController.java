
package com.example.Email_demo.Controller;

import com.example.Email_demo.DTO.RegisterRequestDTO;
import com.example.Email_demo.DTO.RegisterResponseDTO;
import com.example.Email_demo.Service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(
            @Valid @RequestBody RegisterRequestDTO request) {

        RegisterResponseDTO response = authService.register(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}