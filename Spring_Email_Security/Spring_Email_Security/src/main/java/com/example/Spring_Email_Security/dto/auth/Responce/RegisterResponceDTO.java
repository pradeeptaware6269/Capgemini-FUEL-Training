package com.example.Spring_Email_Security.dto.auth.Responce;


import com.example.Spring_Email_Security.model.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@Repository
public class RegisterResponceDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public RegisterResponceDTO(User user)
    {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();

    }
    public RegisterResponceDTO() {

    }

}
