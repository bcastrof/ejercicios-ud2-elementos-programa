package com.jaureguialzo.holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un mensaje:");

        String mensaje = br.readLine();

        System.out.println("Has escrito: " + mensaje);
    }
}
