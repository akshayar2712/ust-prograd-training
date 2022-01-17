package com.example.BankingApplication.controller;

import com.example.BankingApplication.entity.Account;
import com.example.BankingApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    public void createAccount(Integer accountID,Integer balance,String accountStatus){
        Account account=new Account(accountID,balance,accountStatus);
        accountService.createAccount(account);
    }

    @GetMapping("/account/{accountID}")
    public Account printAccountDetails(@PathVariable  Integer accountID){
        return accountService.printAccountDetails(accountID);
    }
}
