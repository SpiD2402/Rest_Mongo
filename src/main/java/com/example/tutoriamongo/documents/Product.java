package com.example.tutoriamongo.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {

    @Id
    private String _id;

    private String name;

    private  Double price;

    private int quatity;


}
