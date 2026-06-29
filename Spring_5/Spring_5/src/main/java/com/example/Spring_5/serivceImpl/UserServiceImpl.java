package com.example.Spring_5.serivceImpl;

import com.example.Spring_5.model.User;
import com.example.Spring_5.repository.UserRepository;
import com.example.Spring_5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userrepository;

    @Override
    public User saveUser(User user) {
        return userrepository.save(user);
    }

    @Override
    public User getUserrepository(Long id) {
        return userrepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        userrepository.deleteById(id);
    }
}