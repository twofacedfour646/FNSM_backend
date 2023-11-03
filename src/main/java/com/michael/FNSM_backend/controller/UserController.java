package com.michael.FNSM_backend.controller;

import com.michael.FNSM_backend.model.User;
import com.michael.FNSM_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

class LoginRequestBody {
    String username;
    String password;
}

record LoginResponse(String text) {

}

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
        System.out.println(request.username);
        System.out.println(request.password);
        return new LoginResponse("This is a test token");
    }
}
