package com.company;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
            Scanner Salario = new Scanner(System.in);

            System.out.print("Introduce un salario: ");
            double sMensual = Salario.nextInt();
            double sAnual = sMensual * 12;
            double impuesto = 0;

            if (sAnual < 10000) {
                impuesto = sAnual * 0.5;
            } else if (sAnual >= 10001 && sAnual <= 25000) {
                impuesto = sAnual * 0.12;
            } else if (sAnual >= 25001 && sAnual <= 38000) {
                impuesto = sAnual * 0.15;
            } else if (sAnual >= 38001 && sAnual <= 60000) {
                impuesto = sAnual * 0.22;
            } else if (sAnual > 6000) {
                impuesto = sAnual * 0.30;
            }
            System.out.println("El salario mensual que has colocado es " + sMensual + "€");
            System.out.println("El salario anual será: " + sAnual + "€");
            System.out.print("El impuesto a pagar es: ");
            System.out.printf("%.2f %n", impuesto);

            //Se utiliza printf para que muestre 2 decimales

        }
    }
