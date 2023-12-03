package com.example.lab_week07.frontend.controllers;

import com.example.lab_week07.backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/customerList")
    public String showCustomerList(Model model){
        model.addAttribute("customerList", customerRepository.findAll());
        return "customer/list";
    }
}
