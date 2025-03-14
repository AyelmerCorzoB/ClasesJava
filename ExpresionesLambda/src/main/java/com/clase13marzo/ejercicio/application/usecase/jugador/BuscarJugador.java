package com.clase13marzo.ejercicio.application.usecase.jugador;

import java.util.Scanner;

import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;

public class BuscarJugador {
    public void buscar(Scanner sc, JugadorUseCase jugadorCasoUso) {
        System.out.print("Ingresa el ID del cliente a buscar: ");
        ValidacionInt.validar(sc);
        int idBusqueda = sc.nextInt();
        sc.nextLine();
        jugadorCasoUso.obtenerJugador(idBusqueda);
    }
}