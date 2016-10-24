package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Quieres números pares o impares (P|I): ");
        String respuesta = br.readLine();

        int n = 0;

/*
        if (respuesta.equals("P")) {
            n = 2;
        } else {
            n = 1;
        }
*/

        switch (respuesta.toUpperCase()) {
            case "P":
                n = 2;
                break;
            case "I":
                n = 1;
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        if (n != 0) {
            for (int i = 0; i < 100; i++) {
                System.out.println(n);
                n += 2;
            }
        }
    }
}
