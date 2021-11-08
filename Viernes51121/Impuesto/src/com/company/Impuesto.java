package com.company;

import java.util.Scanner;

public class Impuesto {

    public static void main(String[] args) {
        Scanner Impuesto = new Scanner(System.in);
        System.out.print("Introduce el valor del articulo: " );
        double precio = Impuesto.nextDouble();
        double impuesto = 0;
        if (precio < 300) {
            impuesto = 0;
        } else
            impuesto = precio * 0.05;
            System.out.println("El precio del impuesto es: " + impuesto + " €");
            System.out.println("El valor total es: " + (precio + impuesto) + " €");
    }
}

