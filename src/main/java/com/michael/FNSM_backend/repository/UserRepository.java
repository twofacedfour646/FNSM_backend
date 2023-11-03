package com.michael.FNSM_backend.repository;

import com.michael.FNSM_backend.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(UUID.randomUUID().toString(), "michael_gubler", "password"));
        users.add(new User(UUID.randomUUID().toString(), "john_doe", "test"));
    }

    // Get all users
    public List<User> findAll() {
        return users;
    }

    // Login user
    public String loginUser(String username, String password) {
        return null;
    }
}
