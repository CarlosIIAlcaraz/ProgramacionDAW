package com.company;

import java.util.Scanner;

public class Consecutivo {

    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Introduce tu primer numero para la serie a realizar: ");
        int num1 = cons.nextInt();
        System.out.println("Introduce tu segundo numero para la serie a realizar: ");
        int num2 = cons.nextInt();
        System.out.println("Establece un numero que limite la serie a realizar: ");
        int totalNum = cons.nextInt();

        int suma = 0;
        System.out.println(num1 + " " + num2 + " ");
        for (int i = 2; i < totalNum; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            System.out.println(suma + " ");
        }
    }
}