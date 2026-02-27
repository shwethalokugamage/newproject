package edu_icet.controller;

import edu_icet.model.Customer;
import edu_icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService service;


    @GetMapping("/customer")
    private List<String> getName() {
        return service.getName();
    }

    @GetMapping("/id")
    private List<String> getId() {
        return service.getId();
    }

    @GetMapping("/address")
    private List<String> getAddress() {
        return service.getAddress();
    }

    @GetMapping("/city")
    private List<String> getCity() {
        return service.getCity();
//        return "test";
    }

    @GetMapping("/province")
    private List<String> getProvince() {
        return service.getProvince();
    }

    @GetMapping("/get-all")
    public List<Customer> getAllCustomer() {
        return service.getAllCustomer();
    }
}
