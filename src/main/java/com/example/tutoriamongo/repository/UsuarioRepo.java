package com.example.tutoriamongo.repository;

import com.example.tutoriamongo.documents.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends MongoRepository<Usuario,String> {
}
