package main;

import main.Beans.Equipo;
import main.Beans.Partido;
import main.Beans.Champions;

import main.Controller.AppController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AppController appController = new AppController();
        ArrayList<Equipo> equipos =new ArrayList<>();
        boolean estado = true;

        while (estado){
            switch (Main.menuPrincipal()){
                case"1":
                    System.out.println("\n Registro de equipos");
                    System.out.println("**************************");
                    appController.registrarNuevoEquipo(equipos);
                    break;
                case "2":
                    System.out.println("\n Sorteo de llaves");
                    System.out.println("************************");
                    appController.sortearLlaves(equipos);
                    break;
                case "3":
                    System.out.println("\n Colocar Resultados");
                    System.out.println("************************");
                    appController.colocarResultados(equipos);
                    break;
                case "4":
                    System.out.println("\n Imprimir Resultados");
                    System.out.println("************************");
                    appController.imprimirResultados(equipos);
                    break;
                default:
                    System.out.println("\n Ingrese una opción válida");
                    break;
            }
        }
    }

    public static String menuPrincipal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******        Menu Principal       *********");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| 1 <- Registro de equipos                 |");
        System.out.println("| 2 <- Sorteo de llaves                    |");
        System.out.println("| 3 <- Imprimir Resultados                 |");
        System.out.println("| 4 <- Salir                               |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Ingrese opcion: ");
        return scan.nextLine();
    }

}
