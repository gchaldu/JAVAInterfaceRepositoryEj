package com.gchaldu.usuario.view;

import com.gchaldu.usuario.model.entity.Usuario;

import java.util.List;
import java.util.Scanner;

public class UsuarioView {

    public Usuario addUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nom = scanner.nextLine();

        System.out.println("Ingrese apellido");
        String ape = scanner.nextLine();

        System.out.println("Ingrese indentificador");
        String id = scanner.nextLine();

        System.out.println("Ingrese tipo");
        String tipo = scanner.nextLine();

        Usuario usuario = new Usuario(nom,ape,id,tipo);

        return usuario;
    }

    public void mostrarUsuario(Usuario usuario){
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Id: " + usuario.getIdentificacion());
            System.out.println("Tipo: " + usuario.getTipo());
    }
    public void mostrarListaUsuario(List<Usuario> lista){
        for (Usuario usuario: lista){
            this.mostrarUsuario(usuario);
        }
    }
}
