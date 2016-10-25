package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor: ");
        int n = Integer.parseInt(br.readLine());

/*
        int t = 1;

        for (int i = 2; i <= n ; i++) {
            t *= i; // t = t * i
        }

        System.out.println("El factorial es: "+t);
*/

/*
        int numeroFijo = n;
        int t = 1;

        for (int i = 0; i < numeroFijo; i++) {
            t = t * n;
            n = n - 1;
        }

        System.out.println("El factorial es: "+t);
*/

        int t = 1;

        for (int i = n; i >= 2; i--) {
            t = t * i;
        }

        System.out.println("El factorial es: "+t);

    }
}
