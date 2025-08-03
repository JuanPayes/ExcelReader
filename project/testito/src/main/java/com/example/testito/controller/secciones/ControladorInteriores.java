package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.Interiores;

import java.util.Scanner;

public class ControladorInteriores {
    private Interiores interiores;
    private Scanner scanner;

    public ControladorInteriores(Interiores  interiores){
        this.interiores = interiores;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("\n--- SECCIÓN: FRENTE ---");
            System.out.println("Seleccione una pieza para modificar:");
            System.out.println("1. Estribio izquierdo");
            System.out.println("2. Estribio derecho");
            System.out.println("3. Piso delantero");
            System.out.println("4. Piso trasero");
            System.out.println("5. Piso baul");
            System.out.println("6. Cama");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        modificarPieza(interiores.getEstriboIzquierdo());
                        break;
                    case 2:
                        modificarPieza(interiores.getEstriboDerecho());
                        break;
                    case 3:
                        modificarPieza(interiores.getPisoDelantero());
                        break;
                    case 4:
                        modificarPieza(interiores.getPisoTrasero());
                        break;
                    case 5:
                        modificarPieza(interiores.getPisoBaul());
                        break;
                    case 6:
                        modificarPieza(interiores.getCama());
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
