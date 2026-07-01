package com.example.Spring_Task_1_BMS.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AccountNotFoundException.class)
    public String handleAccountNotFoundException(AccountNotFoundException exception)
    {
      return  exception.getMessage();
    }

    @ExceptionHandler(InsufficientBalanceException.class)
    public String handleInsfficientBalnceException(InsufficientBalanceException exception)
    {
        return exception.getMessage();
    }
}
