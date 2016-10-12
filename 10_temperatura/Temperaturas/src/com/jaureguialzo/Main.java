package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la temperatura en ºC: ");
        double temperatura = Double.parseDouble(br.readLine());

        System.out.print("Elige (F|K): ");
        char opcion = br.readLine().charAt(0);

/*
        if (opcion == 'F') {
            double fahrenheit = temperatura * 9 / 5 + 32;
            System.out.println("La temperatura en ºF es: " + fahrenheit);
        } else if (opcion == 'K') {
            double kelvin = temperatura + 273.15;
            System.out.println("La temperatura en ºK es: " + kelvin);
        } else {
            System.out.println("ERROR!!!");
        }
*/

        switch (opcion) {
            case 'F':
            case 'f':
                double fahrenheit = temperatura * 9 / 5 + 32;
                System.out.println("La temperatura en ºF es: " + fahrenheit);
                break;
            case 'K':
            case 'k':
                double kelvin = temperatura + 273.15;
                System.out.println("La temperatura en ºK es: " + kelvin);
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }

    }
}
