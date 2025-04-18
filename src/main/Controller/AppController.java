package main.Controller;

import main.Beans.Equipo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AppController {

    public void registrarNuevoEquipo(ArrayList<Equipo> equipos){
        Scanner scanner = new Scanner(System.in);
        Equipo equipo = new Equipo();

        System.out.print("Ingrese el nombre del equipo: ");
        equipo.setNombre(scanner.nextLine());

        System.out.print("Ingrese el número de jugadores del equipo: ");
        equipo.setNumeroDeJugadores(Integer.parseInt(scanner.nextLine()));

        System.out.print("Ingrese el nombre del DT del Equipo:");
        equipo.setNombreDelDT(scanner.nextLine());

        equipos.add(equipo);
    }

    public void sortearLlaves (ArrayList<Equipo> equipos){
        Random rand = new Random();
        for (int i = 0; i < Math.min(2, equipos.size()); i++) {
            int randInt = rand.nextInt(equipos.size()); equipos.remove(randInt); }
    }

    public void colocarResultados(ArrayList<Equipo> equipos){

    }

    public void imprimirResultados(ArrayList<Equipo> equipos){

         System.out.println("\nResultados");
         System.out.println("\nCampeón 2025: EL nombre del equipo");

        }
    }

}
