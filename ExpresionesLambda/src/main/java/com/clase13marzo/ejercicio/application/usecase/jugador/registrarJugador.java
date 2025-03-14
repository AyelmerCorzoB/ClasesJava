package com.clase13marzo.ejercicio.application.usecase.jugador;

import java.util.Scanner;

import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;
import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionString;

public class registrarJugador {
public void registro(Scanner sc, JugadorUseCase jugadorCasoUso) {
        System.out.print("Ingrese ID del Jugador: ");
        ValidacionInt.validar(sc);
        int idRegistro = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese Nombre: ");
        ValidacionString.validar(sc);
        String nombre = sc.nextLine();

        System.out.print("Ingrese Edad: ");
        ValidacionString.validar(sc);
        int edad = sc.nextInt();

        jugadorCasoUso.registrarJugador(idRegistro, nombre, edad);
        System.out.println("\nCliente registrado exitosamente.");
    }
}
