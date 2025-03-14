package com.clase13marzo.ejercicio.database;

public class ConnectionFactory {
    public static ConnectionDb crearConexion() {
        return new ConnMySQL();
    }
}