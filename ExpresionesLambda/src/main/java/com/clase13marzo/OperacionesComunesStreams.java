package com.clase13marzo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.clase13marzo.comparator.Persona;

public class OperacionesComunesStreams {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ayelmer", 20));
        personas.add(new Persona("Ronaldo", 18));
        personas.add(new Persona("Lionel", 32));
        personas.add(new Persona("Neymar", 17));
        personas.add(new Persona("Fede", 31));
        personas.add(new Persona("Junior", 52));
        personas.add(new Persona("Jude", 19));

        List<Persona> mayoresDeEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .collect(Collectors.toList());

        System.out.println("Nombres: " + mayoresDeEdad);

        List<String> nombres = personas.stream()
                    .map(Persona::getNombre)
                    .collect(Collectors.toList());

        System.out.println("Nombres: " + nombres);

        int sumaEdades = personas.stream()
                    .map(Persona::getEdad)
                    .reduce(0, Integer::sum);
        System.out.println("Suma de todas las edades: " + sumaEdades);
    }
}
