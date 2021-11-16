package com.company;

import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {

        Scanner Impares = new Scanner(System.in);
        int numero, suma = 0;

        System.out.println("Introduce un numero: ");
        numero = Impares.nextInt();

            for (int i = 1; i < numero; i++) {
                if (i % 2 != 0) {
                    suma += i;

                    System.out.println("La suma de los numeros impares es: " + suma);
                }
            }
        }
    }
