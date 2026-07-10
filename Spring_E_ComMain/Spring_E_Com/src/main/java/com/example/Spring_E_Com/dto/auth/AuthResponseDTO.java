package com.example.Spring_E_Com.dto.auth;

import com.example.Spring_E_Com.model.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String message;
    private String role;


//    public AuthResponseDTO() {
//    }

//    public AuthResponseDTO(User user) {
//        this.id = user.getId();
//        this.firstName = user.getFirstName();
//        this.lastName = user.getLastName();
//        this.email = user.getEmail();
//        this.phone = user.getPhone();
//
//    }
}