package com.company;

import java.util.Scanner;

public class ContadorPrimos {
    public static void main(String[] args) {
        System.out.print("Ingrese un número natural (>0): ");
        Scanner primo = new Scanner(System.in);
        int n = primo.nextInt();

        if (n <= 0) {
            System.out.printf("El número debe ser mayor que cero%n");
        } else {
            int cant_divisores = 0;
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    cant_divisores++;
                }
                i++;
            }
            if (cant_divisores == 0 && n > 1) {
                System.out.printf("El número que has ingresado ES PRIMO%n");
            } else {
                System.out.printf("El número que has ingresado lastimosamente NO ES PRIMO%n");
            }
        }
    }
}
