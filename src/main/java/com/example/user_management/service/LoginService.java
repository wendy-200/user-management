package com.example.user_management.service;

import com.example.user_management.DTO.LoginResponse;
import com.example.user_management.Repository.UserRepository;
import com.example.user_management.entity.UserApp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class LoginService {
   public  final UserRepository UserRepository;

    public LoginService(com.example.user_management.Repository.UserRepository userRepository) {
        UserRepository = userRepository;
    }

    public ResponseEntity<LoginResponse>validateCredentials(String user , String pass){
        Optional<UserApp>userOptional = UserRepository.findByUsername(user);{
            if(userOptional.isPresent()) {
                UserApp savedUserApp = userOptional.get();
                if(savedUserApp.getPassword(). equals(pass)) {
                    return new ResponseEntity<>(new LoginResponse("Login Successful"), HttpStatus.OK);
                 }else {
                    return new ResponseEntity<>(new LoginResponse("Wrong Credentials"), HttpStatus.OK);
                }
            }else {
                return new ResponseEntity<>(new LoginResponse("Wrong Credentials"), HttpStatus.OK);

            }
        }
    }
}
