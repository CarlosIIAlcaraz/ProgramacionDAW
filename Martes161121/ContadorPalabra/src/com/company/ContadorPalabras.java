package com.company;


import java.util.Scanner;
import java.util.StringTokenizer;

public class ContadorPalabras {
    public static void main(String[] args) {
    String frase;
    Scanner contador = new Scanner(System.in);
        StringTokenizer cuenta;
        int palabras=1;

        System.out.println("Introduce una frase: ");
        frase=contador.nextLine().trim();
        cuenta=new StringTokenizer(frase);
        System.out.println("Calculando el total de palabras que tiene la frase...");
        System.out.println("La frase tiene un total de: "+cuenta.countTokens()+" palabras");
            for (int c=0;c<frase.length();c++){
                if ((frase.charAt(c)==' ')&&(frase.charAt(c+1)!=' ')){palabras++;}
            }
        System.out.println("¡Un placer ayudarte!");
    }
}
