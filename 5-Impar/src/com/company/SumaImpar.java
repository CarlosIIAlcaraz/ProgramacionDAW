package com.company;

public class SumaImpar {

    public static void main(String[] args) {
        int X = 0, suma = 0;
        while (X <= 20) {
            if (X % 2 != 0) {
                suma += X;
            }
            X++;
        }
        System.out.println("La suma de los primeros " + (X - 1) + " números impares es: " + suma);
    }
}
