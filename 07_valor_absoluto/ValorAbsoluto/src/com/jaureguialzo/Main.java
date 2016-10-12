package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leer el valor
        System.out.print("Escribe un número: ");
        int n = Integer.parseInt(br.readLine());

        // Repetir si es != 0
        while (n != 0) {

            // Ver si es negativo e invertirlo si toca
            if (n < 0) {
                n = n * -1;
            }

            // Mostrarlo
            System.out.println("El valor absoluto es: " + n);

            // Actualizar el valor
            System.out.print("Escribe otro número: ");
            n = Integer.parseInt(br.readLine());
        }

        // Terminamos
        System.out.println("FIN");
    }
}
