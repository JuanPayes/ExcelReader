package com.example.testito.controller;

import com.example.testito.model.Pieza;

import java.util.Scanner;

public class GestorPiezas {
    private static final Scanner scanner = new Scanner(System.in);

    public static void  modificarPieza(Pieza pieza){
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- MODIFICANDO: " + pieza.getNombre() + " ---");
            System.out.println("1. Ver tiempos actuales");
            System.out.println("2. Modificar tiempo de desarmado (en días)");
            System.out.println("3. Modificar tiempo de enderezado (en horas)");
            System.out.println("4. Modificar tiempo de pasteado (en días)");
            System.out.println("5. Modificar tiempo de armado (en horas)");
            System.out.println("6. Marcar como presente/ausente");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            try {

                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        mostrarEstadoPieza(pieza);
                        break;
                    case 2:
                        System.out.print("Ingrese tiempo de desarmado (días): ");
                        pieza.setTiempoDesarmado(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.print("Ingrese tiempo de enderezado (horas): ");
                        pieza.setTiempoEnderezado(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.print("Ingrese tiempo de pasteado (días): ");
                        pieza.setTiempoPasteado(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.print("Ingrese tiempo de armado (horas): ");
                        pieza.setTiempoArmado(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 6:
                        System.out.print("¿La pieza está presente? (true/false): ");
                        pieza.setPresente(Boolean.parseBoolean(scanner.nextLine()));
                        break;
                    case 0:
                        System.out.println("Volviendo al menú anterior...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada no valida. Intente de nuevo.");
            }
        }
    }
    private static void mostrarEstadoPieza(Pieza pieza) {
        System.out.println("Tiempo desarmado: " + pieza.getTiempoDesarmado());
        System.out.println("Tiempo enderezado: " + pieza.getTiempoEnderezado());
        System.out.println("Tiempo pasteado: " + pieza.getTiempoPasteado());
        System.out.println("Tiempo armado: " + pieza.getTiempoArmado());
        System.out.println("¿Presente?: " + (pieza.isPresente() ? "Sí" : "No"));
    }
}
