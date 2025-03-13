package com.clase13marzo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.clase13marzo.consumer.Estudiante;

public class consumerE {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante("Ayelmer", 85.5));
        estudiantes.add(new Estudiante("Elidallana", 92.0));
        estudiantes.add(new Estudiante("Lorena", 78.3));
        estudiantes.add(new Estudiante("Daniel", 88.9));

        Consumer<Estudiante> imprimirNombre = estudiante -> System.out.println(estudiante.getNombre());

        estudiantes.forEach(imprimirNombre);
    }
}
