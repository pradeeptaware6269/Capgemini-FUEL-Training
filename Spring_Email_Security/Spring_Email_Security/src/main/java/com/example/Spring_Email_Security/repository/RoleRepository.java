package com.example.Spring_Email_Security.repository;


import com.example.Spring_Email_Security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(String name);

    boolean existsByName(String name);
}
