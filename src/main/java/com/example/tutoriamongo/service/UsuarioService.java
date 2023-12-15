package com.example.tutoriamongo.service;

import com.example.tutoriamongo.documents.Usuario;
import com.example.tutoriamongo.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;


    //Logica de negocio
    public Usuario addUser(Usuario usuario)
    {
        //validacion de username
        //validacion genero
        return  usuarioRepo.save(usuario);
    }


}
