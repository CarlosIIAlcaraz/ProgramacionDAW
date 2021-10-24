package com.company;

import java.util.Scanner;

public class Asteriscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        int X = 0;
        while (X < numero) {
            System.out.print("*");
            X++;
        }
        System.out.println();
        sc.close();
    }
}
