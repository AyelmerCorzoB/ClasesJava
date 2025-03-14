package com.clase13marzo.ejercicio;

import java.util.Scanner;

import com.clase13marzo.ejercicio.application.ui.FiltrosUi;
import com.clase13marzo.ejercicio.application.ui.JugadorUI;
import com.clase13marzo.ejercicio.application.ui.MenuPrincipal;
import com.clase13marzo.ejercicio.application.usecase.filtros.filtrosUseCase;
import com.clase13marzo.ejercicio.application.usecase.jugador.JugadorUseCase;
import com.clase13marzo.ejercicio.application.usecase.problems.ValidacionInt;
import com.clase13marzo.ejercicio.database.ConnectionFactory;
import com.clase13marzo.ejercicio.domain.repository.JugadoresRepository;
import com.clase13marzo.ejercicio.persistence.Jugador.JugadorRepositoryImpl;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Inicializa el repositorio y el caso de uso de jugadores
        JugadoresRepository repositorioJugador = new JugadorRepositoryImpl(ConnectionFactory.crearConexion());
        JugadorUseCase jugadorUseCase = new JugadorUseCase(repositorioJugador);
        // Inicializa el caso de uso de filtros
        filtrosUseCase filtrosCasoUso = new filtrosUseCase();

        try (Scanner sc = new Scanner(System.in)) {
            int opcionMenu;
            do {
                MenuPrincipal.mostrarMenuPrincipal();

                ValidacionInt.validar(sc);

                opcionMenu = sc.nextInt();

                sc.nextLine();
                switch (opcionMenu) {
                    case 1:
                        JugadorUI.manejarMenuJugadores(sc, jugadorUseCase);
                        break;
                    case 2:
                        // Pasa la instancia de filtrosCasoUso y jugadorUseCase
                        FiltrosUi.manejarMenuFiltros(sc, filtrosCasoUso, jugadorUseCase);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Vuelva a intentarlo.");
                        break;
                }
            } while (opcionMenu != 3);
        }
    }
}