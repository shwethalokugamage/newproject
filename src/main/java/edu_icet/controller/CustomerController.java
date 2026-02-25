package edu_icet.controller;

import edu_icet.service.CustomerService;
import edu_icet.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/customer")
    private String getName() {
        return service.getName();
    }

    @GetMapping("/age")
    private String getAge() {
        return service.getAge();
    }
}
