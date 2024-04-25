package com.gchaldu.libro.view;

import com.gchaldu.libro.model.entity.Libro;

import java.util.Scanner;

public class LibroView {

    public Libro registrarLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa titulo del Libro");
        String titulo = scanner.nextLine();

        System.out.println("Ingresa autor del Libro");
        String author = scanner.nextLine();

        System.out.println("Ingresa genero del Libro");
        String genero = scanner.nextLine();

        System.out.println("Ingresa copias del Libro");
        Integer copias = scanner.nextInt();

        Libro libro = new Libro(titulo,author,genero,copias);

        return libro;
    }
}
