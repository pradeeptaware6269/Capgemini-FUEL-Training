package com.example.Spring_9.Repository;

import com.example.Spring_9.model.User;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
