package com.clase13marzo.ejercicio.application.ui;

import java.util.Scanner;
import com.clase13marzo.ejercicio.application.usecase.filtros.filtrosUseCase;
import com.clase13marzo.ejercicio.application.usecase.jugador.JugadorUseCase;
import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;

public class FiltrosUi {

    public static void manejarMenuFiltros(Scanner sc, filtrosUseCase filtrosCasoUso, JugadorUseCase jugadorUseCase) {
        int opcionJugador;
        do {
            String menuJugador = """
                    ********Filtros Jugadores********
                    1. Ordenar jugadores por nombre
                    2. Ordenar jugadores por edad
                    3. Ordenar jugadores por ID
                    4. Salir...
                    Seleccione una opción:""";
            System.out.print(menuJugador);

            ValidacionInt.validar(sc);
            opcionJugador = sc.nextInt();

            sc.nextLine();

            switch (opcionJugador) {
                case 1:
                    filtrosCasoUso.OrdenarJugadoresPorNombre(jugadorUseCase);
                    break;
                case 2:
                    filtrosCasoUso.OrdenarJugadoresPorEdad(jugadorUseCase);
                    break;
                case 3:
                    filtrosCasoUso.OrdenarJugadoresPorID(jugadorUseCase);
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                    break;
            }
        } while (opcionJugador != 4);
    }
}