package com.example.Spring_Email_Security.exception;

public class RoleNotFoundException extends  RuntimeException{
    public RoleNotFoundException(String message) {
        super(message);
    }
}
