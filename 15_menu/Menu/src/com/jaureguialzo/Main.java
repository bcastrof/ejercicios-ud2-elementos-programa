package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe otro número: ");
        int n2 = Integer.parseInt(br.readLine());

        char opcion;
        do {

            System.out.print("MENÚ\n" +
                    "----\n" +
                    "a) Suma.\n" +
                    "b) Resta.\n" +
                    "c) Multiplicación.\n" +
                    "d) División.\n" +
                    "e) Resto.\n" +
                    "f) Terminar.\n" +
                    "\n" +
                    "Introduzca una opción: ");

            opcion = br.readLine().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("La suma es: " + (n1 + n2));
                    break;
                case 'b':
                    System.out.println("La resta es: " + (n1 - n2));
                    break;
                case 'c':
                    System.out.println("La multiplicación es: " + (n1 * n2));
                    break;
                case 'd':
                    System.out.println("La división es: " + (n1 / n2));
                    break;
                case 'e':
                    System.out.println("El módulo es: " + (n1 % n2));
                    break;
                case 'f':
                    System.out.println("Hasta otra...");
                    break;
                default:
                    System.out.println("Error, escribe una opción válida...");
                    break;
            }

        } while (opcion != 'f');
    }
}
