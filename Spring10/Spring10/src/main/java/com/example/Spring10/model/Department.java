package com.example.Spring10.model;

import jakarta.persistence.Entity;

@Entity
public class Department extends User{

    private String section;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
