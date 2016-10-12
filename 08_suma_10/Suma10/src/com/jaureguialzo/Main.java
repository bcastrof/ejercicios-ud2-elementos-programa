package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Escribe un número: ");
            int n = Integer.parseInt(br.readLine());

            //total = total + n;
            total += n;
        }

/*
        int i = 0;
        while (i < 10) {

            System.out.print("Escribe un número: ");
            int n = Integer.parseInt(br.readLine());

            total = total + n;

            i++;
            //i = i + 1;
            //i += 1;
        }
*/

        System.out.println("La suma es: " + total);
    }
}
