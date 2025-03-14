package com.clase13marzo.ejercicio.application.ui;

import java.util.Scanner;

import com.clase13marzo.ejercicio.application.usecase.jugador.JugadorUseCase;
import com.clase13marzo.ejercicio.application.usecase.jugador.*;
import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;

public class JugadorUI {
public static void manejarMenuJugadores(Scanner sc, JugadorUseCase jugadorCasoUso) {
        int opcionJugador;
        do {
            String menuJugador = """
                    ********Jugadores********
                    1. Registrar Jugador
                    2. Obtener Jugador por ID
                    3. Listar todos los Jugadores
                    4. Actualizar un Jugador
                    5. Eliminar un Jugador
                    6. Salir...
                    Seleccione una opción:""";
            System.out.print(menuJugador);

            ValidacionInt.validar(sc);
            opcionJugador = sc.nextInt();

            sc.nextLine();

            switch (opcionJugador) {
                case 1:
                    registrarJugador registrar = new registrarJugador();
                    registrar.registro(sc, jugadorCasoUso);
                    break;
                case 2:
                    BuscarJugador buscarJugador = new BuscarJugador();
                    buscarJugador.buscar(sc, jugadorCasoUso);
                    break;
                case 3:
                    jugadorCasoUso.listarJugadores();
                    break;
                case 4:
                    ActualizarJugador actualizarJugador = new ActualizarJugador();
                    actualizarJugador.actualizar(sc, jugadorCasoUso);
                    break;
                case 5:
                    EliminarJugador eliminarJugador = new EliminarJugador();
                    eliminarJugador.eliminar(sc, jugadorCasoUso);
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                    break;
            }
        } while (opcionJugador != 6);
    }
}
