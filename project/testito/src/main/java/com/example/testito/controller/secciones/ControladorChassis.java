package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.Chassis;

import java.util.Scanner;

public class ControladorChassis {
    private Chassis chassis;
    private Scanner scanner;

    public ControladorChassis(Chassis chassis){
        this.chassis = chassis;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("\n--- SECCIÓN: FRENTE ---");
            System.out.println("Seleccione una pieza para modificar:");
            System.out.println("1. Piernas delantera");
            System.out.println("2. Bastidor delantero");
            System.out.println("3. Bastidor intermedio");
            System.out.println("4. Bastidor trasero");
            System.out.println("5. Piernas traseras");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        modificarPieza(chassis.getPiernasDelanteras());
                        break;
                    case 2:
                        modificarPieza(chassis.getBastidorDelantero());
                        break;
                    case 3:
                        modificarPieza(chassis.getBastidorIntermedio());
                        break;
                    case 4:
                        modificarPieza(chassis.getBastidorTrasero());
                        break;
                    case 5:
                        modificarPieza(chassis.getPiernasTraseras());
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
