package edu_icet.service;

import edu_icet.model.Customer;
import edu_icet.repository.CustomerRepository;

import java.util.List;

public interface CustomerService {
    public List<String> getName();

    public List<String> getId();

    public List<String> getAddress();

    public List<String> getCity();

    public List<String> getProvince();

    List<Customer> getAllCustomer();
}
