package com.example.tutoriamongo.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Address {

    private String city;

    private String street;

}
