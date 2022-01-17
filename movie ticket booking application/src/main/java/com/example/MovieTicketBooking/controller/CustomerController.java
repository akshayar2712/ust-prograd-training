package com.example.MovieTicketBooking.controller;

import com.example.MovieTicketBooking.entity.Customer;
//import com.example.MovieTicketBooking.service.MovieService;
import com.example.MovieTicketBooking.service.CustomerService;
import com.example.MovieTicketBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private MovieService movieService;


    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/register")
    public String registrationForm() {
        return "register";
    }

    @PostMapping("/login")
    public String registration(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String mobileNumber = request.getParameter("mobileNumber");
        Customer customer = new Customer(userName, password, mobileNumber);
        customerService.createCustomer(customer);
        return "login";
    }


    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/movies")
    public String movies(){
        return "movies";
    }

    @PostMapping("/movies")
    public String login(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Customer customer;
        if (customerService.existsById(userName)) {
            customer = customerService.findCustomerByUserName(userName);
            if (password.equals(customer.getPassword())) {
                model.addAttribute("userName", userName);
                model.addAttribute("movies", movieService.movieList() );
            } else {
                model.addAttribute("message", "Wrong Password");
                return "login";

            }
        } else {
            model.addAttribute("message", "Please enter valid User Name");
            return "login";

        }
        return "movies";
    }




}