package com.example.Spring_Task_1_BMS.serviceImpl;

import com.example.Spring_Task_1_BMS.exception.AccountNotFoundException;
import com.example.Spring_Task_1_BMS.exception.InsufficientBalanceException;
import com.example.Spring_Task_1_BMS.model.Account;
import com.example.Spring_Task_1_BMS.repository.AccountRepo;
import com.example.Spring_Task_1_BMS.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo accountRepo;
    @Override
    public Account saveAccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepo.findById(id).orElseThrow(() -> new AccountNotFoundException("Accound id is Not Found .... :"+id));
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepo.findById(id).orElseThrow(() -> new AccountNotFoundException("Account id is Not Found so cant delete any account ok ... :"+id));
        accountRepo.deleteById(id);
    }

    @Override
    public Account updateBalance(Long id, double amount) {

        Account account = accountRepo.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Account not found with id is : " + id));

        if(account.getBalance() < amount) {

            throw new InsufficientBalanceException("here current balance is low , and you are tring to withdraw more money ,courrent balance is:"+account.getBalance());

        }
        else {
            double current_balance=account.getBalance();
            double avilable_balance=current_balance - amount;

            System.out.println("The "+ id +" Is successfully withdraw the monery avilable balance is :"+avilable_balance);
            account.setBalance(avilable_balance);
            return accountRepo.save(account);

        }

    }

}
