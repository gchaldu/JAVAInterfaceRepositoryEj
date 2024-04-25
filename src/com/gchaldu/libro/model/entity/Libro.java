package com.gchaldu.libro.model.entity;

import com.gchaldu.interfaces.Prestable;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int copiasDisponibles;

    public Libro(String titulo, String autor, String genero, int copiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }
}
