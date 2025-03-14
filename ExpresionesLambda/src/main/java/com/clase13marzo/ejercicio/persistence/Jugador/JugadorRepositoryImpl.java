package com.clase13marzo.ejercicio.persistence.Jugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.clase13marzo.ejercicio.database.ConnectionDb;
import com.clase13marzo.ejercicio.domain.entity.Jugador;
import com.clase13marzo.ejercicio.domain.repository.JugadoresRepository;

public class JugadorRepositoryImpl implements JugadoresRepository {

    private final ConnectionDb connection;

    public JugadorRepositoryImpl(ConnectionDb connection) {
        this.connection = connection;
    }

    @Override
    public void guardar(Jugador jugadores) {
        String sql = "INSERT INTO jugadores (id, nombre, edad) VALUES (?, ?, ?)";
        try (Connection conexion = connection.getConexion();
                PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, jugadores.getId());
            stmt.setString(2, jugadores.getNombre());
            stmt.setInt(3, jugadores.getEdad());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actualizar(Jugador jugadores) {
        String sql = "UPDATE jugadores SET nombre = ?, edad = ? WHERE id = ?";
        try (Connection conexion = connection.getConexion();
                PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, jugadores.getNombre());
            stmt.setInt(2, jugadores.getEdad());
            stmt.setInt(3, jugadores.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Jugador buscarPorId(int id) {
        String sql = "SELECT * FROM jugadores WHERE id = ?";
        try (Connection conexion = connection.getConexion();
                PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("----------------------------------");
                System.out.println("|"+"ID: "+rs.getInt("id"));
                System.out.println("|"+"Nombre: "+rs.getString("nombre"));
                System.out.println("|"+"Edad: "+rs.getInt("edad"));
                System.out.println("----------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM jugadores WHERE id = ?";
        try (Connection conexion = connection.getConexion();
                PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    

    @Override
    public List<Jugador> listarTodos() {
        List<Jugador> jugadores = new ArrayList<>();
        String sql = "select nombre,edad from jugadores";
        try (Connection conexion = connection.getConexion();
                PreparedStatement stmt = conexion.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                jugadores.add(new Jugador(nombre, edad));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Consumer<Jugador> consumer = (jugador) -> System.out.println(jugador);
        jugadores.forEach(consumer);
        return jugadores;
    }

}
