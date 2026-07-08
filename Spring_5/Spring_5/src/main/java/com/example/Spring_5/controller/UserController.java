package com.example.Spring_5.controller;

import com.example.Spring_5.model.User;
import com.example.Spring_5.serivceImpl.UserServiceImpl;
import com.example.Spring_5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    // Save User
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // Get User by ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserrepository(id);
    }


    @DeleteMapping("/{id}")
    public String getDelete(@PathVariable Long id)
    {
        userService.deleteUser(id);
        return "User Deleted Successfully:"+id;
    }

    @PutMapping("/{id}")
    public User getupdate(@PathVariable Long id,@RequestBody User user)
    {
        user.setId(id);
        return userService.saveUser(user);
    }
}