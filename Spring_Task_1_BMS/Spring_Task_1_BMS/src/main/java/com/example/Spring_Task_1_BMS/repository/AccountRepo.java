package com.example.Spring_Task_1_BMS.repository;

import com.example.Spring_Task_1_BMS.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository <Account,Long> {

}
