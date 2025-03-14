package com.clase13marzo.ejercicio.domain.entity;

public class Jugador {
    private int id;
    private String nombre;
    private int edad;

    public Jugador(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " - " + id;
    }

    // Método personalizado para formatear la salida sin el id
    public String toStringSinId() {
        return nombre + " - " + edad;
    }
}