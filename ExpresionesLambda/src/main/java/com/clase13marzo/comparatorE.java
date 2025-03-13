package com.clase13marzo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.clase13marzo.comparator.Persona;

public class comparatorE {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ayelmer", 21));
        personas.add(new Persona("Elidallana", 22));
        personas.add(new Persona("Lorena", 19));
        personas.add(new Persona("Daniel", 20));

        Comparator<Persona> porNombre = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());

        Collections.sort(personas, porNombre);

        personas.forEach(System.out::println);
    }
}