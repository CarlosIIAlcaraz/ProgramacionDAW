package com.company;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner figura = new Scanner(System.in);
        System.out.print("Introduce un numero para realizar la figura. (1 - 10):  ");
        int numero = figura.nextInt();

        if (numero > 1 && numero <= 10) {

            for (int j = 0; j <= numero; j++) {
                int i = 0;
                while (i < j) {
                    if (i % 2 == 0) {
                        System.out.print("*");

                    } else {
                        System.out.print("0");
                    }
                    i++;
                }
                System.out.println();
            }
        }
    }
}
