package com.company;

import java.util.Scanner;

public class MenuBucle {

    public static void main(String[] args) {
        int Comida = 0, Bebida = 0, totalVentas = 0;
        double DineroTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1- refresco - 2€");
        System.out.println("2- cerveza - 1,50€");
        System.out.println("3- agua mineral - 1,75€");
        System.out.println("4- ensalada - 2€ ");
        System.out.println("5- salchichas - 2,75€");
        System.out.println("6- bocadillo - 2€");
        System.out.println("7- sopa - 2,60€");
        System.out.println("8- pastel - 3€");


        System.out.print("Elegir una opcion 1-8: ");
        int codigo = sc.nextInt();
        while (codigo != 0) {
            if (codigo >= 1 && codigo <= 8) {
                switch (codigo) {
                    case 1:
                        Bebida++;
                        DineroTotal += 2.00;
                        break;
                    case 2:
                        Bebida++;
                        DineroTotal += 1.50;
                        break;
                    case 3:
                        Bebida++;
                        DineroTotal += 1.75;
                        break;
                    case 4:
                        Comida++;
                        DineroTotal += 2.00;
                        break;
                    case 5:
                        Comida++;
                        DineroTotal += 2.75;
                        break;
                    case 6:
                        Comida++;
                        DineroTotal += 2.00;
                        break;
                    case 7:
                        Comida++;
                        DineroTotal += 2.60;
                        break;
                    case 8:
                        Comida++;
                        DineroTotal += 3.00;
                        break;
                }
                System.out.println("venta realizada");
            } else {
                System.out.println("pedido incorrecto");
            }
            System.out.print("¿algo mas? 1-8 comida - bebida o 0 para finalizar: ");
            codigo = sc.nextInt();
        }
        totalVentas = Bebida + Comida;
        double porcentajeVentasComida = (Bebida * 100 / totalVentas);
        double porcentajeVentasBebida = (Comida * 100 / totalVentas);

        System.out.println("venta total: " + totalVentas);
        System.out.println("venta total de comidas: " + Comida);
        System.out.println("venta total de bebidas: " + Bebida);
        System.out.println("dinero obtenido " + DineroTotal + "€");
        System.out.println("% bebida pedida: " + porcentajeVentasBebida + "%");
        System.out.println("% comida pedida: " + porcentajeVentasComida + "%");
    }

}

