package com.example.Spring_5.service;

import com.example.Spring_5.model.User;

public interface UserService {

    User saveUser(User user);

    User getUserrepository(Long id);

    void deleteUser(Long id);
}