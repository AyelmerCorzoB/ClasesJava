package com.clase13marzo.ejercicio.application.usecase.jugador;

import java.util.Scanner;

import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;
import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionString;

public class ActualizarJugador {
public void actualizar(Scanner sc, JugadorUseCase JugadorCasoUso) {
        System.out.print("Ingresa el ID del Jugador que quieres actualizar: ");
        ValidacionInt.validar(sc);
        int idActualizar = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nuevo nombre: ");
        ValidacionString.validar(sc);
        String nuevoNombre = sc.nextLine();
        System.out.print("Ingresa el nuevo email: ");
        ValidacionInt.validar(sc);
        int nuevoEdad = sc.nextInt();
        JugadorCasoUso.actualizarJugador(idActualizar, nuevoNombre, nuevoEdad);
    }
}
