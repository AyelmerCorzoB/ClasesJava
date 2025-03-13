package com.clase13marzo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import com.clase13marzo.comparator.Persona;

public class SupplierE2 {
    public static void main(String[] args) {
        String[] nombres = {"Ayelmer", "Elidallana", "Lorena", "Daniel" , "Daniel"};

        Set<String> nombresUsados = new HashSet<>();

        Supplier<Persona> generarPersonaAleatoria = () -> {
            Random random = new Random();
            String nombreAleatorio = null;

            while (true) {
                nombreAleatorio = nombres[random.nextInt(nombres.length)];
                if (!nombresUsados.contains(nombreAleatorio)) {
                    nombresUsados.add(nombreAleatorio);
                    break;                    
                }
            }

            int edadAleatoria = 18 + random.nextInt(45);
            return new Persona(nombreAleatorio, edadAleatoria);
        };
        for (int i = 0; i < nombres.length; i++) {
            Persona persona = generarPersonaAleatoria.get();
            System.out.println(persona);
        }
    }
}
