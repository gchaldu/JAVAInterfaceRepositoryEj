package com.gchaldu.libro.model.repository;

import com.gchaldu.interfaces.Repository;
import com.gchaldu.libro.model.entity.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroRepository implements Repository {
    private List<Libro> listaLibros;


    public LibroRepository() {
        this.listaLibros = new ArrayList<>();
    }

    @Override
    public void registrar(Object obj) {
        this.listaLibros.add((Libro) obj);
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
