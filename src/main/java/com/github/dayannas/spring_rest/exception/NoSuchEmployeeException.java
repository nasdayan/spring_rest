package com.github.dayannas.spring_rest.exception;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
