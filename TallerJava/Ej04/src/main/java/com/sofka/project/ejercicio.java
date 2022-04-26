package com.sofka.project;

import java.util.Scanner;

public class ejercicio {
    static void CalcularIVA(String precio){
        double iva=0.21;
        double price=Double.parseDouble(precio);
        double nPrice=iva*price;
        System.out.println("El precio final con IVA es: "+nPrice);
    }
    public static void main(String[] args) {
        Scanner capture=new Scanner(System.in);
        System.out.print("Precio: ");
        String precio=capture.nextLine();
        CalcularIVA(precio);
    }
}
