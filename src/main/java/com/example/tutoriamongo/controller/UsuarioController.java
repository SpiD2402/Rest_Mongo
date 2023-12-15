package com.example.tutoriamongo.controller;

import com.example.tutoriamongo.documents.Usuario;
import com.example.tutoriamongo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario addUser(@RequestBody Usuario usuario)
    {
        return usuarioService.addUser(usuario);
    }

}
