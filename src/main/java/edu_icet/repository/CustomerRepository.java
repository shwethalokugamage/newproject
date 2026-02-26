package edu_icet.repository;

import edu_icet.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository

public class CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

        public List<String> getName() {
            List<String> stringList = jdbcTemplate.query("SELECT * FROM customer", (rs, rowNum) -> rs.getNString(3));
            System.out.println(stringList);
            return stringList;
        }

        public List<String> getId() {
            List<String> stringList = jdbcTemplate.query("SELECT * FROM customer",(rs, rowNum) -> rs.getNString(1));
            System.out.println(stringList);
            return stringList;
        }

        public List<String> getAddress() {
            List<String> stringList =jdbcTemplate.query("SELECT * FROM customer",(rs, rowNum) -> rs.getNString(6));
            System.out.println(stringList);
            return stringList;
        }

        public List<String> getCity() {
            List<String> stringList =jdbcTemplate.query("SELECT * FROM customer",(rs, rowNum) -> rs.getNString(7));
            System.out.println(stringList);
            return stringList;
        }

        public List<String> getProvince() {
            List<String> stringList =jdbcTemplate.query("SELECT * FROM customer",(rs, rowNum) -> rs.getNString(8));
            System.out.println(stringList);
            return stringList;
        }

    public List<Customer> getAllCustomer() {
            List<Customer> customerList =jdbcTemplate.query("SELECT * FROM customer",(rs, rowNum) -> new Customer(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4).toLocalDate(),
                    rs.getDouble(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
            ));
            return customerList;
    }
}