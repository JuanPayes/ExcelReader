package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.Techo;

import java.util.Scanner;

public class ControladorTecho {
    private Techo techo;
    private Scanner scanner;

    public ControladorTecho(Techo techo){
        this.techo = techo;
        this.scanner = new Scanner(System.in);
    }

    public void mostarMenu(){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("\n--- SECCIÓN: FRENTE ---");
            System.out.println("Seleccione una pieza para modificar:");
            System.out.println("1. Pilarillo izquierdo");
            System.out.println("2. Pilarillo derecho");
            System.out.println("3. Techo frente");
            System.out.println("4. Techo trasero");
            System.out.println("5. Sunroof");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        modificarPieza(techo.getPilarilloIzquierdo());
                        break;
                    case 2:
                        modificarPieza(techo.getPilarilloDerecho());
                        break;
                    case 3:
                        modificarPieza(techo.getTechoFrente());
                        break;
                    case 4:
                        modificarPieza(techo.getTechoTrasero());
                        break;
                    case 5:
                        modificarPieza(techo.getSunroofAjuste());
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
