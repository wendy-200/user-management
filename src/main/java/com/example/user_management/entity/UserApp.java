package com.example.user_management.entity;


import jakarta.persistence.*;

@Entity
public class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String userId;
    private String name;
    private String lastname;
    private String email;
    private String username;
    private String password;

    public UserApp() {
    }

    public UserApp(long id, String userId, String name, String lastname, String email, String username, String password) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public UserApp(String userId, String name, String lastname, String email, String username, String password) {
        this.userId = userId;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
