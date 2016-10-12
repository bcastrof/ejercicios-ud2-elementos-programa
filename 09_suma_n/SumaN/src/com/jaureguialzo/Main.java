package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Cuantas repeticiones: ");
        int X = Integer.parseInt(br.readLine());

        int total = 0;

        for (int i = 0; i < X; i++) {

            System.out.print("Escribe un número: ");
            int n = Integer.parseInt(br.readLine());

            total += n;
        }

        System.out.println("La suma es: " + total);
    }
}
