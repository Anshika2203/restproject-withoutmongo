package com.test.withoutmorphia.controller;

import com.test.withoutmorphia.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ApiService {
    User user;
    @GetMapping("{userId}")
    public User getUserDetails(String UserId){
        return user;
    }

    @PostMapping
    public String createUserDetails(@RequestBody User user){
        this.user=user;
        return "User created successfully";
    }

    @PutMapping
    public String updateUserDetails(@RequestBody User user){
        this.user=user;
        return "User updated successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails(String userId){
        this.user=null;
        return "User deleted successfully";
    }

}