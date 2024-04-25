package com.gchaldu.prestamo.view;

import com.gchaldu.libro.model.entity.Libro;
import com.gchaldu.prestamo.model.entity.Prestamo;
import com.gchaldu.usuario.model.entity.Usuario;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PrestamoView {

    public Prestamo addPrestamo(){

        Date fechaPrestamo = new Date();
        long tiempoPrestamo = 7 * 24 * 60 * 60 * 1000; // 7 días en milisegundos
        Date fechaDevolucionEsperada = new Date(fechaPrestamo.getTime() + tiempoPrestamo);

        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucionEsperada);

        return prestamo;
    }

    public void mostrarPrestamo(Prestamo prestamo){
        Usuario u = prestamo.getUsuario();
        Libro l = prestamo.getLibro();
        Date fechaPrestado = prestamo.getFechaPrestamo();
        Date fechaDevuelto = prestamo.getFechaDevolucion();

        System.out.println("El usuario: " + u.getApellido());
        System.out.println("PRESTAMO LIBRO");
        System.out.println();
        System.out.println("Reservo el libro " + l.getTitulo());
        System.out.println("Autor " + l.getAutor());
        System.out.println();
        System.out.println("fechaDevuelto = " + fechaDevuelto);
        System.out.println("fechaPrestado = " + fechaPrestado);
    }

    public void listadoPrestamos(List<Prestamo> lista){
        for (Prestamo prestamo: lista){
            this.mostrarPrestamo(prestamo);
        }
    }
}
