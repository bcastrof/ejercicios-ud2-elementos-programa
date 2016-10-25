package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variables para los resultados
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        boolean hayQueMostrarResultados = false; // Flag

        // Pedir al usuario que escriba
        System.out.print("Escribe un número o FIN: ");
        String texto = br.readLine();

        while (!texto.equalsIgnoreCase("FIN")) {

            hayQueMostrarResultados = true; // Activar el flag

            // Convertir el valor, sabemos que no ha escrito FIN
            int n = Integer.parseInt(texto);

            // Totalizar
            total += n;

            // Comparar min y max
            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }

            // Pedir al usuario que escriba
            System.out.print("Escribe un número o FIN: ");
            texto = br.readLine();
        }

        // Mostrar los resultados
        if( max != Integer.MIN_VALUE && min != Integer.MAX_VALUE ) {
        //if (hayQueMostrarResultados) {
            System.out.println("El total es: " + total);
            System.out.println("El máximo es: " + max);
            System.out.println("El mínimo es: " + min);
        } else {
            System.out.println("No has introducido valores...");
        }
    }
}
