package com.clase13marzo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.clase13marzo.comparator.Persona;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Ayelmer", 20));
        listaPersonas.add(new Persona("Ronaldo", 18));
        listaPersonas.add(new Persona("Lionel", 32));
        listaPersonas.add(new Persona("Neymar", 17));
        listaPersonas.add(new Persona("Fede", 31));
        listaPersonas.add(new Persona("Junior", 52));
        listaPersonas.add(new Persona("Jude", 19));

        Predicate<Persona> esMayorDeEdad = persona -> persona.getEdad() > 19;

        List<Persona> mayoresDeEdad = listaPersonas.stream()
                .filter(esMayorDeEdad)
                .collect(Collectors.toList());
                
        Comparator<Persona> porNombre = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        // Collections.sort(mayoresDeEdad, porNombre);

        Comparator<Persona> porEdad = (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad());
        Collections.sort(mayoresDeEdad, porEdad);

        System.out.println("Mayores de edad:");
        mayoresDeEdad.forEach(persona -> System.out.println(persona.getNombre() + " - " + persona.getEdad()));
        
    }
}