/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expresiones.lambda.Ejercicio3;

/**
 *
 * @author JOAHAN CARLO
 */
public class Pelicula {

    private int id;
    private String titulo;
    private String director;
    private int estreno;
    private boolean chort;

    public Pelicula(int id, String titulo, String director, int estreno) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }

    
    
    public Pelicula(int id, String titulo, String director, int estreno, boolean chort) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
        this.chort = chort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public boolean isChort() {
        return chort;
    }

    public void setChort(boolean chort) {
        this.chort = chort;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Titulo=" + titulo + ", Director=" + director + ", Estreno=" + estreno + ", Chort=" + chort;
    }

   
}
