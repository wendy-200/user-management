package com.example.user_management.Repository;

import com.example.user_management.entity.UserApp;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserApp, Long> {
    Optional<UserApp>findByUsername(String Username);
}
