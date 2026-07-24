package com.example.Spring_E_Com.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_user_email", columnNames = "email")
        }
)
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseEntity {

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "is_active", nullable = false)
    @Builder.Default
    private Boolean isActive = true;

    @Column(name = "is_email_verified", nullable = false)
    @Builder.Default
    private Boolean emailVerified = false;

    @Column(name = "account_non_locked", nullable = false)
    @Builder.Default
    private Boolean accountNonLocked = true;

    @Column(name = "account_not_expired", nullable = false)
    @Builder.Default
    private Boolean accountNotExpired = true;

    @Column(name = "credentials_non_expired", nullable = false)
    @Builder.Default
    private Boolean credentialsNonExpired = true;

    @Column(name = "phone", length = 15)
    private String phone;

    private String token;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "role_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_user_role")
    )
    private Role role;
}