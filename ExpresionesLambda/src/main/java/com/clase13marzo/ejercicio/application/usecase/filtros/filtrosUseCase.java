package com.clase13marzo.ejercicio.application.usecase.filtros;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.clase13marzo.ejercicio.application.usecase.jugador.JugadorUseCase;
import com.clase13marzo.ejercicio.domain.entity.Jugador;

public class filtrosUseCase {
    
    public void OrdenarJugadoresPorEdad(JugadorUseCase jugadorCasoUso) {    
        List<Jugador> jugadores = jugadorCasoUso.listarJugadores();
        Comparator<Jugador> porEdad = (p1, p2) -> Integer.compare(p1.getEdad(),p2.getEdad());

        Collections.sort(jugadores, porEdad);
        jugadores.forEach(System.out::println);
    }

    public void OrdenarJugadoresPorNombre(JugadorUseCase jugadorCasoUso) {    
        List<Jugador> jugadores = jugadorCasoUso.listarJugadores();
        Comparator<Jugador> porNombre = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());

        Collections.sort(jugadores, porNombre);
        jugadores.forEach(System.out::println);
    }

    public void OrdenarJugadoresPorID(JugadorUseCase jugadorCasoUso) {    
        List<Jugador> jugadores = jugadorCasoUso.listarJugadores();
        Comparator<Jugador> porId = (p1, p2) -> Integer.compare(p1.getId(),p2.getId());

        Collections.sort(jugadores, porId);
        jugadores.forEach(System.out::println);
    }
}