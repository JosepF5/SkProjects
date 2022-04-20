package com.sofka.proyect;

import java.util.Scanner;

public class index {
    static void CalcularArea(String radio,double pi){
        double rad=Double.parseDouble(radio);
        double radiocarbon=Math.pow(rad,2);
        System.out.println("El área del círculo es: "+radiocarbon*pi);
    }
    public static void main(String[] args) {
        Scanner capture=new Scanner(System.in);
        double pi=3.1416;
        System.out.print("Ingrese el radio: ");
        String radio=capture.nextLine();
        CalcularArea(radio,pi);
    }
}
