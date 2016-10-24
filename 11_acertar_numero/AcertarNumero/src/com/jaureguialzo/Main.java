package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Generar el número aleatorio
        Random r = new Random();
        int aleatorio = r.nextInt(100);

        // Hacer trampas!!
        //System.out.println("He elegido el número: " + aleatorio);

        int n = 0;
        String texto;

        int intentos = 0;

        do {
            // Cuenta de intentos
            intentos += 1;

            // Leer lo que escriba el usuario
            System.out.print("Escribe un número: ");

            texto = br.readLine();

            if (texto.equalsIgnoreCase("FIN")) {
                System.out.println("Hasta luego cobarde!!!");
            } else {

                // Jugar
                n = Integer.parseInt(texto);

                // Ver si ha acertado o no
                if (n == aleatorio) {
                    System.out.println("Has acertado!!");
                    System.out.println("Has necesitado " + intentos + " intento(s)");
                } else if (n > aleatorio) {
                    System.out.println("Te has pasado!!");
                } else {
                    System.out.println("No llegas");
                }
            }

        } while (n != aleatorio && !texto.equalsIgnoreCase("FIN"));
    }
}
