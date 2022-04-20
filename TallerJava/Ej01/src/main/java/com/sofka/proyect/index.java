package com.sofka.proyect;

public class index {
    static void ValidarA(String dato1, String dato2){
        if(dato1.equals(dato2)){
            System.out.println("Son iguales");
        }
    }
    static void ValidarB(String dato1, String dato2){
        int a=Integer.parseInt(dato1);
        int b=Integer.parseInt(dato2);
        int max=Math.max(a,b);
        System.out.println(max+" es mayor");;
    }

    public static void main(String[] args) {
        String dato="30";
        String dato1="5";
        ValidarA(dato,dato1);
        ValidarB(dato,dato1);
    }
}