package com.example.Spring_Task_1_BMS.service;

import com.example.Spring_Task_1_BMS.model.Account;

public interface AccountService {

    Account saveAccount(Account account);

    Account getAccount(Long id);

    void deleteAccount(Long id);

    Account updateBalance(Long id,double balnce);
}
