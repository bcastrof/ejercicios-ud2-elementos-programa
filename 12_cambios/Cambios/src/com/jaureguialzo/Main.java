package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leer el precio
        System.out.print("Escribe el precio: ");
        double precio = Double.parseDouble(br.readLine());

        // Convertirlo a céntimos
        int precioInt = (int) (precio * 100);

        System.out.print("Escribe la cantidad: ");

        double cantidad;

        int cantidadInt;

        do {

            String texto = br.readLine();
            cantidad = Double.parseDouble(texto);
            cantidadInt = (int) (cantidad * 100);

            if (!(cantidadInt >= precioInt && cantidadInt % 5 == 0)) {
                System.out.println("Cantidad insuficiente o no es múltiplo de 5.");
                System.out.print("Vuelve a escribir: ");
            }

        } while (!(cantidadInt >= precioInt && cantidadInt % 5 == 0));

        // Ver si el importe es exacto
        if (cantidadInt == precioInt) {
            System.out.println("Importe exacto...");
        } else {
            // Devolver los cambios

            int cambio = cantidadInt - precioInt;

            int monedas = cambio / 200;
            System.out.println("Monedas de 2€: " + monedas);
            cambio = cambio % 200;

            monedas = cambio / 100;
            System.out.println("Monedas de 1€: " + monedas);
            cambio = cambio % 100;

            monedas = cambio / 50;
            System.out.println("Monedas de 50c: " + monedas);
            cambio = cambio % 50;

            monedas = cambio / 20;
            System.out.println("Monedas de 20c: " + monedas);
            cambio = cambio % 20;

            monedas = cambio / 10;
            System.out.println("Monedas de 10c: " + monedas);
            cambio = cambio % 10;

            monedas = cambio / 5;
            System.out.println("Monedas de 5c: " + monedas);

        }

    }
}
