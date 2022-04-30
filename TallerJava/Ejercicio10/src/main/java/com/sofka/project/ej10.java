package com.sofka.project;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Frase: ");
        String mensaje = captura.nextLine();
        mensaje = mensaje.replace(" ", "");

        System.out.println(mensaje);
    }
}
