package com.clase13marzo.ejercicio.domain.repository;

import java.util.List;

import com.clase13marzo.ejercicio.domain.entity.Jugador;

public interface JugadoresRepository {
    void guardar(Jugador Jugadore);
    Jugador buscarPorId(int id);
    List<Jugador> listarTodos();
    void actualizar(Jugador Jugadore);
    void eliminar(int id);
}
