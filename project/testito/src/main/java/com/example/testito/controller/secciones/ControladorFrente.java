package com.example.testito.controller.secciones;

import com.example.testito.controller.GestorPiezas;
import com.example.testito.model.Pieza;
import com.example.testito.model.secciones.Frente;
import java.util.Scanner;

public class ControladorFrente {
    private Frente frente;
    private Scanner scanner;

    public ControladorFrente(Frente frente) {
        this.frente = frente;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion = -1;
        while (opcion != 0){
            System.out.println("\n--- SECCIÓN: FRENTE ---");
            System.out.println("Seleccione una pieza para modificar:");
            System.out.println("1. Capo");
            System.out.println("2. Guardafango izq");
            System.out.println("3. Guardafango der");
            System.out.println("4. Bumper");
            System.out.println("5. Alma de Bumper");
            System.out.println("6. Marco de Radiador");
            System.out.println("7. Torre Izq");
            System.out.println("8. Torre Der");
            System.out.println("0. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        modificarPieza(frente.getCapo());
                        break;
                    case 2:
                        modificarPieza(frente.getGuardafangoIzq());
                        break;
                    case 3:
                        modificarPieza(frente.getGuardafangoDer());
                        break;
                    case 4:
                        modificarPieza(frente.getBumper());
                        break;
                    case 5:
                        modificarPieza(frente.getAlmaDeBumper());
                        break;
                    case 6:
                        modificarPieza(frente.getMarcoDeRadiador());
                        break;
                    case 7:
                        modificarPieza(frente.getTorreIzq());
                        break;
                    case 8:
                        modificarPieza(frente.getTorreDer());
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
