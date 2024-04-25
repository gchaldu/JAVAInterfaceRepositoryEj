package com.gchaldu.biblioteca.model.entity;

import com.gchaldu.interfaces.Prestable;
import com.gchaldu.interfaces.Repository;
import com.gchaldu.prestamo.model.entity.Prestamo;

public class Biblioteca implements Repository, Prestable{


    @Override
    public void realizarPrestamo(Prestamo prestamo) {

    }

    @Override
    public void registrarDevolucion(Prestamo prestamo) {

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
