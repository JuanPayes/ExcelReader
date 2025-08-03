package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.ParteTrasera;

import java.util.Scanner;

public class ControladorParteTrasera {
    private ParteTrasera parteTrasera;
    private Scanner scanner;

    public ControladorParteTrasera(ParteTrasera parteTrasera){
        this.parteTrasera = parteTrasera;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("\n--- SECCIÓN: FRENTE ---");
            System.out.println("Seleccione una pieza para modificar:");
            System.out.println("1. Compuerta/tapadera");
            System.out.println("2. Bumber Trasero");
            System.out.println("3. Recibidor");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        modificarPieza(parteTrasera.getCompuertaTapadera());
                        break;
                    case 2:
                        modificarPieza(parteTrasera.getBumperTrasero());
                        break;
                    case 3:
                        modificarPieza(parteTrasera.getRecibidor());
                        break;
                    case 0:
                        System.out.println("Volviendo al menú anterior...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (NumberFormatException e ){
                System.out.println("Entrada no valida. Intente de nuevo.");
            }
        }

    }
    private void modificarPieza(Pieza pieza){
        GestorPiezas.modificarPieza(pieza);
    }
}
