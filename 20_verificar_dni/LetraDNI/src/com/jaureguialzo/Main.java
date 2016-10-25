package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el DNI: ");
        int DNI = Integer.parseInt(br.readLine());

        System.out.println("Escribe la letra: ");
        char letra = br.readLine().charAt(0);

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int resto = DNI % 23;

        char r = letras.charAt(resto);

        if( letra == r) {
            // DNI y letra OK
            System.out.println("OK");
        } else {
            // Error
            System.out.println("Error, la letra debería ser "+r);
        }

    }
}
