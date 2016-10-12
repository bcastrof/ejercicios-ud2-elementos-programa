package com.jaureguialzo.holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe el primer número: ");
        String texto = br.readLine();
        int n1 = Integer.parseInt(texto);

        System.out.println("Escribe el segundo número: ");
        int n2 = Integer.parseInt(br.readLine());

        int r = n1 * n2;

        System.out.println("El resultado es: " + r);

    }
}
