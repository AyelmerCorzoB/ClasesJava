package com.clase13marzo;

import java.util.Arrays;
import java.util.List;

public class iterarsobreunacoleccion {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("1. uno", "2. dos", "3. tres");
        lista.forEach(s -> System.out.println(s));
    }
}
