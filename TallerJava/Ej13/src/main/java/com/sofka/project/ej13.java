package com.sofka.project;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class ej13 {
    public static void main(String[] args) {
        String date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.print("Fecha: " + date);
    }
}
