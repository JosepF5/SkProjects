package com.sofka.project;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = captura.nextInt();
        for (int i = num; i <= 1000 ; i += 2) {
            System.out.print(i);
        }
    }

}
