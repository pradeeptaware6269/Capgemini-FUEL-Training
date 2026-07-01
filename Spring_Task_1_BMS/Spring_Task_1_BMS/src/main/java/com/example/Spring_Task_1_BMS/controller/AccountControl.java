package com.example.Spring_Task_1_BMS.controller;

import com.example.Spring_Task_1_BMS.model.Account;
import com.example.Spring_Task_1_BMS.repository.AccountRepo;
import com.example.Spring_Task_1_BMS.serviceImpl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountControl {

    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @GetMapping("/{id}")
    public Account getAcc(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @DeleteMapping("{id}")
    public String getdelete(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return "Here Account data is deleted successfully .... :" + id;
    }


    @PutMapping("/{id}/{balance}")
    public Account withdraw(@PathVariable Long id,
                            @PathVariable double balance) {

        return accountService.updateBalance(id, balance);
    }
}