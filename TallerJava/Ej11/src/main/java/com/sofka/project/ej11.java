package com.sofka.project;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Frase: ");
        String mensaje = captura.nextLine();

        int[] cuenta = {0,0,0,0,0};

        for (int i = 0; i < mensaje.length() ; i++) {
            char letra = mensaje.toLowerCase().charAt(i);
            switch (letra){
                case 'a':
                    cuenta[0]++;
                    break;
                case 'e':
                    cuenta[1]++;
                    break;
                case 'i':
                    cuenta[2]++;
                    break;
                case 'o':
                    cuenta[3]++;
                    break;
                case 'u':
                    cuenta[4]++;
                    break;
            }
        }

        System.out.println("Longitud: " + mensaje.length());
        System.out.println("Vocales: ");
        System.out.println("a: " + cuenta[0]);
        System.out.println("e: " + cuenta[1]);
        System.out.println("i: " + cuenta[2]);
        System.out.println("o: " + cuenta[3]);
        System.out.println("u: " + cuenta[4]);
    }
}
