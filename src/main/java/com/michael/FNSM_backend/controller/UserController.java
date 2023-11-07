package com.michael.FNSM_backend.controller;

import com.michael.FNSM_backend.model.User;
import com.michael.FNSM_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

record LoginRequestBody(String username, String password) {}

record LoginResponse(String response) {}

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    // GET all users
    @GetMapping
    public List<User> findAll() {
        return this.repository.findAll();
    }

    @PostMapping("/login")
    @ResponseBody
    public LoginResponse handleLogin(@RequestBody LoginRequestBody request) {
        // Deconstruct request
        String enteredUsername = request.username();
        String enteredPassword = request.password();

        // Get return of login method
        String loginResult = this.repository.loginUser(enteredUsername, enteredPassword);

        return new LoginResponse(loginResult);
    }
}
