package com.sofka.project;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Palabra 1: ");
        String palA = captura.next();
        System.out.print("Palabra 2: ");
        String palB = captura.next();

        if (palA.equals(palB)) {
            System.out.println("Palabras iguales");
        } else {
            int size = palA.length() > palB.length() ? palB.length() : palA.length();
            System.out.println("Diferencias: ");
            for (int i = 0; i < size; i++) {
                if (palA.charAt(i) != palB.charAt(i)) {
                    System.out.println(palA.charAt(i));
                }
            }
        }
    }
}
