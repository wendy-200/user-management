package com.example.user_management.DTO;

public class LoginResponse {
    public String message;

    public LoginResponse() {
    }

    public LoginResponse(String message) {
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


