package com.clase13marzo.ejercicio.application.usecase.jugador;

import java.util.List;

import com.clase13marzo.ejercicio.domain.entity.Jugador;
import com.clase13marzo.ejercicio.domain.repository.JugadoresRepository;

public class JugadorUseCase {

    private final JugadoresRepository repository;

    public JugadorUseCase(JugadoresRepository repository) {
        this.repository = repository;
    }

    public void registrarJugador(int id, String nombre, int edad) {
        Jugador jugador = new Jugador(id, nombre, edad);
        repository.guardar(jugador);
    }

    public Jugador obtenerJugador(int id) {
        return repository.buscarPorId(id);
    }

    public List<Jugador> listarJugadores() {
        return repository.listarTodos();
    }

    public void actualizarJugador(int id, String nombre, int edad) {
        Jugador Jugador = new Jugador(id, nombre, edad);
        repository.actualizar(Jugador);
    }

    public void eliminarJugador(int id) {
        repository.eliminar(id);
    }
}
