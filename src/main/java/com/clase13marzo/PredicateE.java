package com.clase13marzo;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateE {
    public static void main(String[] args) {
        Predicate<Integer> esPar = n -> n % 2 == 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        boolean validate = esPar.test(numero);
        if (validate == true) {
            System.out.println("el numero:" + numero + " Es PAR");
        } else { 
            System.out.println("el numero:" + numero + " Es IMPAR");
        }
    }
}
