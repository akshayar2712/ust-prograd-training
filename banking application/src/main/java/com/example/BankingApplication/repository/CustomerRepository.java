package com.example.BankingApplication.repository;

import com.example.BankingApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

    Customer findByPassword(String password);
}