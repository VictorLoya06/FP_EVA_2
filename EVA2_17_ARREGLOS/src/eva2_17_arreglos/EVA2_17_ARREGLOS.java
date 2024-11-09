/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cantidad;
        int califas[];
        String nombre[];

        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de calificaciones a registrar:");
        cantidad = captu.nextInt();
        captu.nextLine(); // Limpiar el buffer

        califas = new int[cantidad];
        nombre = new String[cantidad]; // Inicializamos el arreglo de nombres

        for (int i = 0; i < califas.length; i++) { 
            System.out.println("Nombre del estudiante " + (i + 1) + ":");
            nombre[i] = captu.nextLine();

            System.out.println("Calificacion del estudiante " + (i + 1) + ":");
            califas[i] = captu.nextInt();
            captu.nextLine(); // Limpiar el buffer después de leer un int
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < califas.length; i++) { 
            System.out.println(nombre[i] + ": " + califas[i]);
    }
    } 
}
