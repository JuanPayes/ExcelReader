package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.CostadoIzq;

import java.util.Scanner;

public class ControladorCostadoIzq {
    private CostadoIzq costadoIzq;
    private Scanner scanner;

    public ControladorCostadoIzq(CostadoIzq costadoIzq){
        this.costadoIzq = costadoIzq;
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
                        modificarPieza(costadoIzq.getPuertaDelantera());
                        break;
                    case 2:
                        modificarPieza(costadoIzq.getPuertaTrasera());
                        break;
                    case 3:
                        modificarPieza(costadoIzq.getFaldonTrasero());
                        break;
                    case 4:
                        modificarPieza(costadoIzq.getPilarDelantero());
                        break;
                    case 5:
                        modificarPieza(costadoIzq.getPilarIntermedio());
                        break;
                    case 6:
                        modificarPieza(costadoIzq.getPilarTrasero());
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
