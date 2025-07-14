package com.example.user_management.entity;


import jakarta.persistence.*;

@Entity
@Table(name =" User")
public class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String Userid;
    private String Name;
    private String Lastname;
    private String Email;
    private String Username;
    private String Password;

    public UserApp() {
    }

    public UserApp(long id, String userid, String name, String lastname, String email, String username, String password) {
        this.id = id;
        Userid = userid;
        Name = name;
        Lastname = lastname;
        Email = email;
        Username = username;
        Password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
