package com.example.BankingApplication.service;

import com.example.BankingApplication.entity.Customer;
import com.example.BankingApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public Customer printCustomerDetails(String password){
        return customerRepository.findByPassword(password);
    }

    public void deleteCustomer(Integer accountID) {
        customerRepository.deleteById(accountID);
    }

}