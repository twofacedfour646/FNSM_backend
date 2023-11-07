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

    // Get user by username
    public User findByUsername(String username) {
        return users.stream().filter(user -> user.username().equals(username)).findFirst().orElse(null);
    }

    // Login user
    public String loginUser(String username, String password) {
        // Validate data
        if (username.isEmpty() || password.isEmpty()) return "Username or password is empty";

        // Find user by username
        User user = findByUsername(username);
        if (user == null) return "User does not exist";

        // Check if passwords match
        if (!user.password().equals(password)) return "Password is incorrect";

        // Generate token
        // Send token
        return username + " and " + password + " bitch!";
    }

    private String generateUserToken(User user) {
        return null;
    }
}
