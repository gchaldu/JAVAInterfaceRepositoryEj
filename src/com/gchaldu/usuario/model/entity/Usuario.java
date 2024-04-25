package com.gchaldu.usuario.model.entity;

import com.gchaldu.persona.abstracta.Persona;

public class Usuario extends Persona {
    private String tipo;

    public Usuario(String nombre, String apellido, String identificacion, String tipo) {
        super(nombre, apellido, identificacion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
