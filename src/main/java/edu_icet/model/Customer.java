package edu_icet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

@lombok.Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String id;
    private String title;
    private String name;
    private LocalDate dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalcode;
}
