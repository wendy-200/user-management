package com.example.user_management.bootstrap;

import com.example.user_management.Repository.UserRepository;
import com.example.user_management.entity.UserApp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrapData implements CommandLineRunner {
    private final UserRepository userRepository;

    public bootstrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  void  createUsers(){
        UserApp userApp1 = new UserApp();
        userApp1.setUserId("1");
        userApp1.setName("Wendy");
        userApp1.setLastname("Ortiz");
        userApp1.setEmail("mabellortiz300@gmail.com");
        userApp1.setUsername("wendy.mabell");
        userApp1.setPassword("123456");

        userRepository.save(userApp1);

        UserApp userApp2 = new UserApp();
        userApp2.setUserId("2");
        userApp2.setName("Administrador");
        userApp2.setLastname("1");
        userApp2.setEmail("admi@ups.edu.ec");
        userApp2.setUsername("admi");
        userApp2.setPassword("123456");
        userRepository.save(userApp2);

    }
    @Override
    public void run(String... args) throws Exception {
        createUsers();
        System.out.println("-------Started BootstrapData");
        System.out.println("Number of users:" + userRepository.count());

    }

}
