package com.company;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("|------------------------------------|");
        System.out.println("|       [1] Refresco - 2.00€         |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [2] Cerveza - 1.50€          |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [3] Agua Mineral - 1.75€     |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [4] Ensalada - 2.00€         |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [5] Salchichas - 2.75€       |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [6] Bocadillo - 2.00€        |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [7] Sopa - 2.60€             |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [8] Pastel - 3.00€           |");
        System.out.println("|------------------------------------|");
        System.out.println("|       [9] Salir                    |");
        System.out.println("|------------------------------------|");

        System.out.println("¿Qué desea pedir? Elija una de las opciones: ");
        int codigo = sc.nextInt();
        switch (codigo) {
            case 1:
                System.out.println("|----------------------------|");
                System.out.println("|         -Refresco-         |");
                System.out.println("|          Bebida            |");
                System.out.println("|          2.00€             |");
                System.out.println("|----------------------------|");
                break;
            case 2:
                System.out.println("|----------------------------|");
                System.out.println("|        -Cerveza-           |");
                System.out.println("|          Bebida            |");
                System.out.println("|          1.50€             |");
                System.out.println("|----------------------------|");
                break;
            case 3:
                System.out.println("|----------------------------|");
                System.out.println("|      -Agua Mineral-        |");
                System.out.println("|          Bebida            |");
                System.out.println("|           1.75€            |");
                System.out.println("|----------------------------|");
                break;
            case 4:
                System.out.println("|----------------------------|");
                System.out.println("|        -Ensalada-          |");
                System.out.println("|          Comida            |");
                System.out.println("|          2.00€             |");
                System.out.println("|----------------------------|");
                break;
            case 5:
                System.out.println("|----------------------------|");
                System.out.println("|        -Salchichas-        |");
                System.out.println("|           Comida           |");
                System.out.println("|           2.75€            |");
                System.out.println("|----------------------------|");
                break;
            case 6:
                System.out.println("|----------------------------|");
                System.out.println("|        -Bocadillo-         |");
                System.out.println("|          Comida            |");
                System.out.println("|           2.00€            |");
                System.out.println("|----------------------------|");
                break;
            case 7:
                System.out.println("|----------------------------|");
                System.out.println("|          -Sopa-            |");
                System.out.println("|          Comida            |");
                System.out.println("|           2.60€            |");
                System.out.println("|----------------------------|");
                break;
            case 8:
                System.out.println("|----------------------------|");
                System.out.println("|         -Pastel-           |");
                System.out.println("|          Comida            |");
                System.out.println("|           3.00€            |");
                System.out.println("|----------------------------|");
                break;
            case 9:
                break;
            default:
                System.out.println("|---------------------------|");
                System.out.println("|     Código incorrecto     |");
                System.out.println("|---------------------------|");
                System.exit(1);
                break;
        }
        System.out.println("¿Quieres agregar algo más a tu pedido? s/n ");
        String respuesta = sc.next();
        if (respuesta.equals("s")) {
            main(args);
        }
        sc.close();
    }
}
