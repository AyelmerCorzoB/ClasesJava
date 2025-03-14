package com.clase13marzo.ejercicio.application.usecase.jugador;

import java.util.Scanner;

import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;

public class EliminarJugador {
 public void eliminar(Scanner sc, JugadorUseCase jugadorCasoUso) {
        System.out.print("Ingresa el ID del jugador que quieres eliminar: ");
        ValidacionInt.validar(sc);
        int idEliminar = sc.nextInt();
        jugadorCasoUso.eliminarJugador(idEliminar);
        System.out.println("Jugador eliminado exitosamente.");
    }
}
