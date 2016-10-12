package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el primer número: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe el segundo número: ");
        int n2 = Integer.parseInt(br.readLine());

        System.out.print("Escribe el tercer número: ");
        int n3 = Integer.parseInt(br.readLine());

        System.out.println("Los valores en orden inverso son: " + n3 + ", " + n2 + ", " + n1);

    }
}
