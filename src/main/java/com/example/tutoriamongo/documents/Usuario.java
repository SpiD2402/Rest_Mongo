package com.example.tutoriamongo.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Usuario {

    @Id
    private String _id;

    private String username;

    private  String gender;

    private Address address;

    @DBRef
    private Product productList;

}
