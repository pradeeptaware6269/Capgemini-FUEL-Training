package com.example.Spring_E_Com.exception;

public class RoleNotFoundException extends  RuntimeException{
    public RoleNotFoundException(String message) {
        super(message);
    }
}
