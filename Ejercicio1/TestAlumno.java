/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expresiones.lambda.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOAHAN CARLO
 */
public class TestAlumno {

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno(1, "142345677", "Joahan Carlo", "Nuñez Soto", "Fisica I", 13, 32));
        listaAlumnos.add(new Alumno(2, "123456677", "Andres Torres", "Torres Pinillos", "Fisica II", 14, 28));
        listaAlumnos.add(new Alumno(3, "984848234", "Luis Castillo", "Salas Arenas", "Quimica I", 10, 27));
        listaAlumnos.add(new Alumno(4, "254496040", "Hernan Barcos", "Castillo Vasquez", "Matematcia I", 9, 26));
        listaAlumnos.add(new Alumno(5, "340605949", "Ana Estrada", "Perez Liñan", "Economia Aplicada I", 8, 25));
        listaAlumnos.add(new Alumno(6, "420203059", "Horacio Camilo", "Valenzuela Torres", "Ecuaciones Diferenciales", 14, 29));
        listaAlumnos.add(new Alumno(7, "560284829", "Pedro Andres", "Castillo Morales", "Calculo III", 7, 30));
        listaAlumnos.add(new Alumno(8, "693929382", "Gerarda Andrea", "Cerna Tavara", "Fisica Mecanica", 8, 31));
        listaAlumnos.add(new Alumno(9, "896969594", "Ernesto Peralta", "Castillejo Peña", "Fisica Nuclear", 14, 26));

        System.out.println("Lista de Alumnos ");
        System.out.println("--------------------------------------");
        listaAlumnos.stream().forEach(a -> a.ImprimirDatos());

        System.out.println("\nAlumnos cuyo nombre empeizan con L u G");
        System.out.println("--------------------------------------");
        listaAlumnos.stream().filter(c -> c.getNombres().charAt(0) == 'L' || c.getNombres().charAt(0) == 'G')
                .forEach(c -> c.ImprimirDatos());

        System.out.println("\n---------------------------------");
        System.out.println("\nLa cantidad de alumnos es : ");
        System.out.println("--------------------------------------");
        System.out.println(listaAlumnos.stream().count());

        System.out.println("\n---------------------------------");
        System.out.println("\nAlumno con menor edad es : ");
        System.out.println("--------------------------------------");
        System.out.println(listaAlumnos.stream().min((a1, a2) -> a1.getEdad() - a2.getEdad()));;

        System.out.println("\n---------------------------------");
        System.out.println("\nAlumno con mayor edad es : ");
        System.out.println("--------------------------------------");
        System.out.println(listaAlumnos.stream().max((a1, a2) -> a1.getEdad() - a2.getEdad()));

        System.out.println("\n---------------------------------");
        System.out.println("\nEl mejor alumno es : ");
        System.out.println("--------------------------------------");
        System.out.println(listaAlumnos.stream().findFirst());

        System.out.println("\n---------------------------------");
        System.out.println("\nNombres de alumnos que terminan en I es : ");
        System.out.println("--------------------------------------");
        listaAlumnos.stream().filter(a->a.getNombreCurso().endsWith("I")).forEach(Alumno::ImprimirDatos);
        
        System.out.println("\n---------------------------------");
        System.out.println("\nAlumnos que tienen un curso en el que el nombre contiene la A : ");
        System.out.println("--------------------------------------");
        listaAlumnos.stream().filter(a->a.getNombreCurso().contains("a")).forEach(Alumno::ImprimirDatos);
        
        System.out.println("\n---------------------------------");
        System.out.println("\nLista de alumnos que el tamaño de su nombre es mayor a 10 caracteres : ");
        System.out.println("--------------------------------------");
        listaAlumnos.stream().filter(a->a.getNombres().length()>10).forEach(Alumno::ImprimirDatos);
    }
}
