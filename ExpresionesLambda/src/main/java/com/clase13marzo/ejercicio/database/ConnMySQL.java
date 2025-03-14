package com.clase13marzo.ejercicio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.clase13marzo.ejercicio.Config.HexaSingleton;


public class ConnMySQL implements ConnectionDb {
    @Override
    public Connection getConexion() throws SQLException {
        HexaSingleton config = HexaSingleton.INSTANCIA;
        String url = config.get("db.url");
        String usuario = config.get("db.user");
        String password = config.get("db.password");

        return DriverManager.getConnection(url, usuario, password);
    }

}