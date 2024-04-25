package com.gchaldu.prestamo.model.repository;

import com.gchaldu.interfaces.Repository;
import com.gchaldu.prestamo.model.entity.Prestamo;

import java.util.ArrayList;
import java.util.List;

public class PrestamoRepository implements Repository {

    private List<Prestamo> listaPrestamos;

    public PrestamoRepository() {
        this.listaPrestamos = new ArrayList<>();
    }

    @Override
    public void registrar(Object obj) {
        this.listaPrestamos.add((Prestamo) obj);
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

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}
