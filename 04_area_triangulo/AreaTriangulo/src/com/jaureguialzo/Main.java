package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la base: ");
        double b = Double.parseDouble(br.readLine());

        System.out.print("Escribe la altura: ");
        double h = Double.parseDouble(br.readLine());

        double a = b * h / 2.0;

        System.out.println("El área es: " + a);
    }
}
