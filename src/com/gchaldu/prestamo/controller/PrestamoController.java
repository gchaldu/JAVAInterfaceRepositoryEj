package com.gchaldu.prestamo.controller;

import com.gchaldu.libro.model.entity.Libro;
import com.gchaldu.libro.model.repository.LibroRepository;
import com.gchaldu.libro.view.LibroView;
import com.gchaldu.prestamo.model.entity.Prestamo;
import com.gchaldu.prestamo.model.repository.PrestamoRepository;
import com.gchaldu.prestamo.view.PrestamoView;
import com.gchaldu.usuario.model.entity.Usuario;
import com.gchaldu.usuario.model.repository.UsuarioRepository;
import com.gchaldu.usuario.view.UsuarioView;

public class PrestamoController {

    private UsuarioRepository usuarioRepository;
    private UsuarioView usuarioView;
    private LibroRepository libroRepository;
    private LibroView libroView;
    private PrestamoView prestamoView;
    private PrestamoRepository prestamoRepository;

    public PrestamoController(UsuarioRepository usuarioRepository, UsuarioView usuarioView, LibroRepository libroRepository, LibroView libroView, PrestamoView prestamoView, PrestamoRepository prestamoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioView = usuarioView;
        this.libroRepository = libroRepository;
        this.libroView = libroView;
        this.prestamoView = prestamoView;
        this.prestamoRepository = prestamoRepository;
    }

    public void addPrestamo(){
        Usuario usuario = this.usuarioView.addUsuario();
        this.usuarioRepository.registrar(usuario);

        Libro libro = this.libroView.registrarLibro();
        this.libroRepository.registrar(libro);

        Prestamo prestamo = this.prestamoView.addPrestamo();
        prestamo.setUsuario(usuario);
        prestamo.setLibro(libro);

        this.prestamoRepository.registrar(prestamo);

    }

    public UsuarioRepository getUsuarioRepository() {
        return usuarioRepository;
    }

    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioView getUsuarioView() {
        return usuarioView;
    }

    public void setUsuarioView(UsuarioView usuarioView) {
        this.usuarioView = usuarioView;
    }

    public LibroRepository getLibroRepository() {
        return libroRepository;
    }

    public void setLibroRepository(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public LibroView getLibroView() {
        return libroView;
    }

    public void setLibroView(LibroView libroView) {
        this.libroView = libroView;
    }

    public PrestamoView getPrestamoView() {
        return prestamoView;
    }

    public void setPrestamoView(PrestamoView prestamoView) {
        this.prestamoView = prestamoView;
    }

    public PrestamoRepository getPrestamoRepository() {
        return prestamoRepository;
    }

    public void setPrestamoRepository(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }
}
