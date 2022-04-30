package com.sofka.project;

import java.util.Locale;
import java.util.Scanner;

public class nuevo {
    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana: ");
        String dia=cap.nextLine().toUpperCase();

        switch (dia){
            case "LUNES":
                System.out.println("Es un día laboral");
                break;
            case "MARTES":
                System.out.println("Es un día laboral");
                break;
            case "MIERCOLES":
                System.out.println("Es un día laboral");
                break;
            case "JUEVES":
                System.out.println("Es un día laboral");
                break;
            case "VIERNES":
                System.out.println("Es un día laboral");
                break;
            case "SABADO":
                System.out.println("No es un día laboral");
                break;
            case "DOMINGO":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Este dia no es valido");
        }
    }
}
