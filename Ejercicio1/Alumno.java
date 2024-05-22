/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expresiones.lambda.Ejercicio1;

/**
 *
 * @author JOAHAN CARLO
 */
public class Alumno {
    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String nombreCurso;
    private double nota;
    private int edad;

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getNota() {
        return nota;
    }

    public int getEdad() {
        return edad;
    }
    
    public Alumno(){
    
    }

    public Alumno(int id, String cedula, String nombres, String apellidos, String nombreCurso, double nota, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
        this.edad = edad;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void ImprimirDatos() {
        System.out.println("\nID : " +id);
        System.out.println("Celula : " +cedula);
        System.out.println("Nombres : " +nombres);
        System.out.println("Apellidos : "+apellidos);
        System.out.println("Nombre del Curso : "+nombreCurso);
        System.out.println("Nota del Curso : "+nota);
        System.out.println("Edad : "+edad);
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nombreCurso=" + nombreCurso + ", nota=" + nota + ", edad=" + edad + '}';
    }
    
    
}
