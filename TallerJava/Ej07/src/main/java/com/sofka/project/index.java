package com.sofka.project;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        do{
            System.out.print("Ingrese num: ");
            num=Integer.parseInt(sc.nextLine());
        }while(num<0);
        System.out.println("El numero es: "+num);
    }
}
