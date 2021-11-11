package com.company;

import java.util.Scanner;

public class Consonantes {

    public static void main(String[] args) {
        Scanner consonantes = new Scanner(System.in);
        String frase;
        int vocales = 0;
        int numeroLetras = 0;

        System.out.println("*** Contador de vocales ***");
        System.out.println("Escribe una frase: ");
        frase = consonantes.nextLine();

        for(int x = 0; x < frase.length(); x++){
            if ((frase.toUpperCase().charAt(x) == 'A') || (frase.toUpperCase().charAt(x) == 'E') ||
                    (frase.toUpperCase().charAt(x) == 'I') || (frase.toUpperCase().charAt(x) == 'O') || (frase.toUpperCase().charAt(x) == 'U')){
                vocales++;
            }for(int y = 0; y < frase.length(); y++){
                if(frase.charAt(y) == ' '){
                    numeroLetras++;
                }
            }
        }
        System.out.println("\nNumero de vocales: " + vocales);
        System.out.println("Longitud de la frase: " + numeroLetras);
    }
}
