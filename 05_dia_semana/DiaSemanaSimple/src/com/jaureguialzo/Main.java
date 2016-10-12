package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dia;
        do {
            System.out.print("Escribe número del 1 al 7: ");
            dia = Integer.parseInt(br.readLine());
        } while (!(dia >= 1 && dia <= 7));

        // Ahora estamos seguro de que dia está en rango

        if (dia == 1) {
            System.out.println("Lunes");
        } else {
            if (dia == 2) {
                System.out.println("Martes");
            } else {
                if (dia == 3) {
                    System.out.println("Miércoles");
                } else {
                    if (dia == 4) {
                        System.out.println("Jueves");
                    } else {
                        if (dia == 5) {
                            System.out.println("Viernes");
                        } else {
                            if (dia == 6) {
                                System.out.println("Sábado");
                            } else {
                                System.out.println("Domingo");
                            }
                        }
                    }
                }
            }
        }
    }
}
