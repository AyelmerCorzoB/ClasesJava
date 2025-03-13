package com.clase13marzo.consumer;

public class Estudiante {
    private String nombre;
    private double nota;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    @Override
    public String toString(){
        return nombre + " - " + nota; 
    }
}
