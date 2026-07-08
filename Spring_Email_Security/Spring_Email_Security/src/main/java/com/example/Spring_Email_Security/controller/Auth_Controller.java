package com.example.Spring_Email_Security.controller;



import com.example.Spring_Email_Security.dto.auth.Request.LoginRequestDTO;
import com.example.Spring_Email_Security.dto.auth.Request.RegisterRequestDTO;
import com.example.Spring_Email_Security.dto.auth.Responce.LoginResponseDTO;
import com.example.Spring_Email_Security.dto.auth.Responce.RegisterResponceDTO;
import com.example.Spring_Email_Security.model.User;
import com.example.Spring_Email_Security.serviceImpl.Auth_ServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class Auth_Controller {

    @Autowired
    private Auth_ServiceImpl authService;

    // For the User
    @PostMapping("/register")
    public ResponseEntity<RegisterResponceDTO> saveRegidster(@Valid @RequestBody RegisterRequestDTO registerRequestDTO) {

        RegisterResponceDTO saveRegister = authService.register(registerRequestDTO);

        return  ResponseEntity.status(HttpStatus.CREATED).body(saveRegister);
    }


    // for the login
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> saveLogin(@Valid @RequestBody LoginRequestDTO loginRequestDTO)
    {
        LoginResponseDTO saveLogin =authService.login(loginRequestDTO);
        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(saveLogin);
    }


    @GetMapping("/{email}")
    public ResponseEntity<RegisterResponceDTO> getCustomer(@PathVariable String email) {

        return ResponseEntity.ok(authService.getRegisterData(email));
    }


    @GetMapping
    public ResponseEntity<List<User>> getAllCustomer() {

        List<User> customers = authService.getAllCustomers();

        return ResponseEntity.ok(customers);
    }







//    @DeleteMapping("/{id}")
//    public String deleteCustomer(@PathVariable Long id) {
//
//        e_com_serviceImpl.deleteCustomer(id);
//
//        return "Customer deleted successfully."+id;
//    }

}