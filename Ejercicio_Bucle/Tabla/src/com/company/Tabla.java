package com.company;

import java.util.Scanner;

public class Tabla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ancho de tabla: ");
        int ancho = sc.nextInt();
        System.out.print("Alto de tabla: ");
        int alto = sc.nextInt();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
