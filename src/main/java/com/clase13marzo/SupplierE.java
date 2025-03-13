package com.clase13marzo;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierE {
    public static void main(String[] args) {
        Supplier<Integer> generarNumeroAleatorio = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
    }
}
