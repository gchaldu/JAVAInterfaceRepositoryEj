package com.gchaldu.libro.controller;

import com.gchaldu.libro.model.repository.LibroRepository;
import com.gchaldu.libro.view.LibroView;

public class LibroController {
    private LibroView libroView;
    private LibroRepository libroRepository;

    public LibroController(LibroView libroView, LibroRepository libroRepository) {
        this.libroView = libroView;
        this.libroRepository = libroRepository;
    }

    public LibroView getLibroView() {
        return libroView;
    }

    public void setLibroView(LibroView libroView) {
        this.libroView = libroView;
    }

    public LibroRepository getLibroRepository() {
        return libroRepository;
    }

    public void setLibroRepository(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
}
