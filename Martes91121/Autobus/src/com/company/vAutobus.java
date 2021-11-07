package com.company;

import java.util.Scanner;

public class vAutobus {

    public static void main(String[] args) {
        Scanner Bus = new Scanner(System.in);


        System.out.print("¿Cuántos kilómetros tendrá el trayecto?: ");
        int trayecto = Bus.nextInt();
        System.out.print("¿Cuántas personas van en grupo?: ");
        int personas = Bus.nextInt();

        double precioPersona = 20 * personas;
        if (trayecto > 200) {
            precioPersona += (trayecto - 200) * 0.03;
        }
        if (trayecto > 400) {
            precioPersona *= 0.85;
        }
        if (personas >= 3) {
            precioPersona *= 0.90;
        }

        double precioFinal = precioPersona * personas;

        System.out.println("El precio del billete por persona " + precioPersona + "€");
        System.out.println("El precio final es: " + precioFinal + "€");

        //Intenté agregarle el "€" al final del precio por persona y precio final y no me aparece
        //le coloqué un printf para que no saliera tantos decimales al imprimir los precios.

        System.out.printf("El precio del billete por persona es: %.2f %n",precioPersona,"€");
        System.out.printf("El precio final es: %.2f %n",precioFinal, "€");
    }
}
