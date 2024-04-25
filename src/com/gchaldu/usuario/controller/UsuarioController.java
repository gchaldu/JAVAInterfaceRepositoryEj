package com.gchaldu.usuario.controller;

import com.gchaldu.usuario.model.entity.Usuario;
import com.gchaldu.usuario.model.repository.UsuarioRepository;
import com.gchaldu.usuario.view.UsuarioView;

import java.util.List;

public class UsuarioController {

    UsuarioRepository usuarioRepository;
    UsuarioView usuarioView;

    public UsuarioController(UsuarioRepository usuarioRepository, UsuarioView usuarioView) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioView = usuarioView;
    }

    public void addUsuario(){
        Usuario usuario = this.usuarioView.addUsuario();
        this.usuarioRepository.registrar(usuario);
    }

    public void mostrarUsuario(){
        List<Usuario> lista = this.usuarioRepository.getListaUsuarios();
        this.usuarioView.mostrarListaUsuario(lista);
    }
}
