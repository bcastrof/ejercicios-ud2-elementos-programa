package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Pedir el número
        System.out.print("Introduce un número: ");
        int n = Integer.parseInt(br.readLine());

        // Dividir n hasta encontrar un factor
/*
        int i = 2;

        while (i < n && n % i != 0) {
            i = i + 1;
        }
*/

        int i; for (i = 2; i < n && n % i != 0; i++);

        // Ver por qué ha parado el bucle
        if (i < n) {
            System.out.println("NO PRIMO");
        } else {
            System.out.println("PRIMO");
        }

    }
}
