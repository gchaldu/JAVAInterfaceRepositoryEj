package com.gchaldu.usuario.model.repository;

import com.gchaldu.interfaces.Repository;
import com.gchaldu.usuario.model.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository implements Repository{

    private List<Usuario> listaUsuarios;

    public UsuarioRepository() {
        this.listaUsuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }


    @Override
    public void registrar(Object obj) {

    }

    @Override
    public Object consultar(String id) {
        return null;
    }

    @Override
    public void actualizar(String id, Object obj) {

    }

    @Override
    public void eliminar(String id) {

    }
}
