/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expresiones.lambda.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author JOAHAN CARLO
 */
public class TestPelicula {

    public static void main(String[] args) {
        List<Pelicula> pelicula = new ArrayList<>();
        pelicula.add(new Pelicula(1, "E.T.", "Steven Spielberg", 1982));
        pelicula.add(new Pelicula(2, "Avatar", "James Cameron", 2009));
        pelicula.add(new Pelicula(3, "Salvar al soldado Ryan", "Steven Spielberg", 1998));
        pelicula.add(new Pelicula(4, "Origen", "Christopher Nolan", 2010));
        pelicula.add(new Pelicula(5, "L.A. Confidential", "Curtis Hanson", 1997));
        
        System.out.println("Obtener sun sublistado de peliculas estrenadas en el siglo XXI (a partir del año 2000)");
        System.out.println("--------------------------------------");
        List<Pelicula> estreno_XXI = pelicula.stream()
                .filter(p->p.getEstreno()>=2000)
                .collect(Collectors.toList());
        estreno_XXI.forEach(System.out::println);
        
        System.out.println("Mostrar por pantalla, separados por coma, los titulos de las peliculas de Steven Speielberg");
        System.out.println("--------------------------------------");
        String listado = pelicula.stream()
                .filter(p->p.getDirector().equals("Steven Spielberg"))
                .map(t->t.getTitulo())
                .collect(Collectors.joining(", ","Nombre de las peliculas de Steven Spielberg : "," "));
        System.out.println(listado);
        
        System.out.println("Obtener un sublistado con los nombres de las peliculas, ordenados alfabeticamente");
        System.out.println("--------------------------------------");
        List<String> listado_pel = pelicula.stream()
                .map(p->p.getTitulo())
                .sorted((p1,p2)->p1.compareTo(p2))
                .collect(Collectors.toList());
        listado_pel.forEach(x->System.out.println(x.toString()));
        
        System.out.println("Mostrar por pantalla el estreno mas reciente");
        System.out.println("--------------------------------------");
        Optional<Pelicula> pelicula_reciente = pelicula.stream()
                .max((p1,p2)->Integer.compare(p1.getEstreno(),p2.getEstreno()));
        String reciente = 
                (pelicula_reciente.isPresent()) 
                ? String.valueOf(pelicula_reciente.get()) 
                : "No se ha encontrado la pelicula";
        System.out.println(reciente);
    }
}
