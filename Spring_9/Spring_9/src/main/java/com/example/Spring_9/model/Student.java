package com.example.Spring_9.model;

import jakarta.persistence.Entity;

@Entity
public class Student extends User {
    private Long id;
    private String email;
    private String address;

}
