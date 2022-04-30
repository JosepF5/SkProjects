package com.sofka.project;

import java.util.Scanner;

public class ej09 {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        String cad = "La sonrisa sera la mejor arma contra la tristeza";
        cad = cad.replace('a','e');
        System.out.print("Nueva frase: ");
        String nuevo = cap.nextLine();
        cad += nuevo;
        System.out.println("Nueva cadena: "+cad);
    }
}
