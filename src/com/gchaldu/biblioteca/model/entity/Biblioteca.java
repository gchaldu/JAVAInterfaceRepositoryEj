package com.gchaldu.biblioteca.model.entity;

import com.gchaldu.interfaces.Prestable;
import com.gchaldu.interfaces.Repository;
import com.gchaldu.prestamo.controller.PrestamoController;
import com.gchaldu.prestamo.model.entity.Prestamo;

import java.util.Date;
import java.util.List;

public class Biblioteca implements Prestable{

    private PrestamoController prestamoController;

    public Biblioteca(PrestamoController prestamoController) {
        this.prestamoController = prestamoController;
    }

    @Override
    public void realizarPrestamo() {
        prestamoController.addPrestamo();
    }

    @Override
    public void registrarDevolucion() {

    }

    public PrestamoController getPrestamoController() {
        return prestamoController;
    }

    public void setPrestamoController(PrestamoController prestamoController) {
        this.prestamoController = prestamoController;
    }
}
