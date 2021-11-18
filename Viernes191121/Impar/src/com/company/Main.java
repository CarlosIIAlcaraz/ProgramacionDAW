package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Introduce un primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce un segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("El total de suma de los numeros impares entre "+num1+" y "+num2+" da como resultado: " +sumaImpares(num1, num2));
    }

    public static boolean esImpar(int numero) {
        boolean impar = true;
        if (numero % 2 == 0) {
            impar = false;
        }
        return impar;
    }

    public static int sumaImpares (int inicio, int fin){
        int suma = 0;
        if (inicio <= fin && inicio > 0 && inicio > 0) {
            for(int i = inicio; i <= fin; i++){
                if (esImpar(i)){
                    suma = suma+i;
                }
            }
        }else {
            suma = -1;
        }
        return suma;
    }
}
