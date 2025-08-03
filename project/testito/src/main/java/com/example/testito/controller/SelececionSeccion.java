package com.example.testito.controller;

import com.example.testito.controller.secciones.*;
import com.example.testito.model.secciones.*;

import java.util.Scanner;

public class SelececionSeccion {

    private Frente frente = new Frente();
    private CostadoIzq costadoIzquierdo = new CostadoIzq();
    private CostadoDer costadoDerecho = new CostadoDer();
    private Interiores interiores = new Interiores();
    private Techo techo = new Techo();
    private ParteTrasera parteTrasera = new ParteTrasera();
    private Chassis chassis = new Chassis();

    private ControladorFrente controladorFrente = new ControladorFrente(frente);
    private ControladorCostadoIzq controlCostadoIzq = new ControladorCostadoIzq(costadoIzquierdo);
    private ControladorCostadoDer controlCostadoDer = new ControladorCostadoDer(costadoDerecho);
    private ControladorInteriores controlInteriores = new ControladorInteriores(interiores);
    private ControladorTecho controlTecho = new ControladorTecho(techo);
    private ControladorParteTrasera controlParteTraser = new ControladorParteTrasera(parteTrasera);
    private  ControladorChassis controlChassis = new ControladorChassis(chassis);

    private Scanner scanner = new Scanner(System.in);

    public void Iniciar(){
        int opcion = -1;
        while (opcion != 0){
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Frente");
            System.out.println("2. Costado izquierdo");
            System.out.println("3. Costado derecho");
            System.out.println("4. Interiores");
            System.out.println("5. Techo");
            System.out.println("6. Parte trasera");
            System.out.println("7. Chasis");
            System.out.println("0. Salir");
            System.out.print("Seleccione una sección: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion){
                    case 1:
                        controladorFrente.mostrarMenu();
                        break;
                    case 2:
                        controlCostadoIzq.mostrarMenu();
                        break;
                    case 3:
                        controlCostadoDer.mostrarMenu();
                        break;
                    case 4:
                        controlInteriores.mostrarMenu();
                        break;
                    case 5:
                        controlTecho.mostarMenu();
                        break;
                    case 6:
                        controlParteTraser.mostrarMenu();
                        break;
                    case 7:
                        controlChassis.mostrarMenu();
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada no valida. Intente de nuevo.");
            }
        }
    }
}
