package edu_icet.service;

import edu_icet.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

        @Override
        public String getName() {
            return new CustomerRepository().getName();
    }
        @Override
        public String getAge() {
            return new CustomerRepository().getAge();
        }
}
