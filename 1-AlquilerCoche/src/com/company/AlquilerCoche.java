package com.company;

import java.util.Scanner;

public class AlquilerCoche {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce el crédito: ");
        int credito = sc.nextInt();

        if (edad >= 21 || credito >= 10000) {
            System.out.println("Tienes la edad correcta, te permito alquilar un coche, disfruta de tu viaje! :)");
        } else {
            System.out.println("¿Dónde vas Yogurin? No cumples con los requisitos, por lo tanto no tienes permitido alquilar ningún coche");
        }

        //Si se coloca && quiere decir que pide especificamente los dos datos obligatoriamente,
        // tener 21 años y 10000€ minimo de crédito.
        //Si se coloca || quiere decir que puede cumplir uno de los dos datos asignados,
        // tener 21 años y 10000€ minimo de credito

        sc.close();
    }
}
