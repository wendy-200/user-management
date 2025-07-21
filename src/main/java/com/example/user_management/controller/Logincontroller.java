package com.example.user_management.controller;


import com.example.user_management.DTO.LoginRequest;
import com.example.user_management.DTO.LoginResponse;
import com.example.user_management.service.LoginService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController


public  class Logincontroller {
    private  final LoginService loginService;

    public Logincontroller(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> processLogin(@RequestBody LoginRequest loginRequest){
        return loginService.validateCredentials(loginRequest.getUser(),loginRequest.getPassword());
    }
  }

