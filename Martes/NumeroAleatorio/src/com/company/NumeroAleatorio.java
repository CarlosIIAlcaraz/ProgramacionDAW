package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int numeroAdivinar = (int) (Math.random() * 100);
            // debe ser entre 1 y 100, por lo que se incrementa en 1;
            int numero = 0;
            int intentos = 0;
            do {
                boolean leido;
                do {
                    System.out.println("Adivina qué número estoy pensando, vamos, tú puedes entre el 1 y el 100:");
                    try {
                        intentos++;
                        numero = teclado.nextInt();
                        System.out.println("Has elegido el número: " + numero);
                        leido = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Tienes que poner el numero en entero, no me seas...");
                        teclado.next(); // se lee el elemento no reconocido para
                        // eliminarlo
                        leido = false;
                    }
                } while (!leido);

                if (numero > numeroAdivinar) {
                    System.out.println("Uy!! Te has pasado, el número es menor, sigue intentándolo: ");

                }
                if (numero < numeroAdivinar) {
                    System.out.println("Ufff, te queda mucho, el número es mayor, sigue intentándolo: ");
                }

            } while (numero != numeroAdivinar);

            System.out.println("¡ENHORABUENA! Por fin lo aciertas, el número es: " + numeroAdivinar);
            System.out.println("Me esperaba más de ti, lo has logrado tras intentarlo: " + intentos+ " veces");

        }
    }
