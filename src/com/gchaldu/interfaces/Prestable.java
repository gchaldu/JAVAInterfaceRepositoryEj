package com.gchaldu.interfaces;

import com.gchaldu.prestamo.model.entity.Prestamo;

public interface Prestable {

    void realizarPrestamo(Prestamo prestamo);
    void registrarDevolucion(Prestamo prestamo);

}
