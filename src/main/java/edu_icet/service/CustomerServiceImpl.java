package edu_icet.service;

import edu_icet.model.Customer;
import edu_icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

        @Override
        public List<String> getName() {
            return customerRepository.getName();
    }
        @Override
        public List<String> getId() {
            return customerRepository.getId();
        }

        @Override
        public List<String> getAddress() {
            return customerRepository.getAddress();
        }

        @Override
        public List<String> getCity() {
            return customerRepository.getCity();
        }

        @Override
        public List<String> getProvince() {
            return customerRepository.getProvince();
        }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }
}
