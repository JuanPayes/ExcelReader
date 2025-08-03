package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.CostadoDer;

import java.util.Scanner;

public class ControladorCostadoDer {
    private CostadoDer costadoDer;
    private Scanner scanner;

    public ControladorCostadoDer(CostadoDer costadoDer){
        this.costadoDer = costadoDer;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("\n--- SECCIÓN: FRENTE ---");
            System.out.println("Seleccione una pieza para modificar:");
            System.out.println("1. Puerta delantera");
            System.out.println("2. Puerta trasera");
            System.out.println("3. Faldon trasero");
            System.out.println("4. Pilar delantero");
            System.out.println("5. Pilar intermedio");
            System.out.println("6. Pilar trasero");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        modificarPieza(costadoDer.getPuertaDelantera());
                        break;
                    case 2:
                        modificarPieza(costadoDer.getPuertaTrasera());
                        break;
                    case 3:
                        modificarPieza(costadoDer.getFaldonTrasero());
                        break;
                    case 4:
                        modificarPieza(costadoDer.getPilarDelantero());
                        break;
                    case 5:
                        modificarPieza(costadoDer.getPilarIntermedio());
                        break;
                    case 6:
                        modificarPieza(costadoDer.getPilarTrasero());
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
