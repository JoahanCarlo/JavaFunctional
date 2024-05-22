/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expresiones.lambda.Ejercicio2;

/**
 *
 * @author JOAHAN CARLO
 */
public class Vehiculo {
    private int id;
    private String matricula;
    private Modelo modelo;
    private int km;

    
    
    public void ImprimirVehiculo(){
        System.out.println("\nID : " +id);
        System.out.println("Matriucula : " +matricula);
        System.out.println("Modelo : " +modelo);
        System.out.println("Kilometraje : "+km);
    }

    public Vehiculo() {
    }

    public Vehiculo(int id, String matricula, Modelo modelo, int km) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.km = km;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return    "ID=" + id + ", "
                + "Matricula=" + matricula + ", "
                + "Modelo=" + modelo + ", "
                + "KM=" + km;
    }
       
}
