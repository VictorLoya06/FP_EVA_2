/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;
        import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class PRACTICA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here

    Scanner scanner = new Scanner(System.in);

    // Solicitar un número al usuario
    System.out.print("Introduce un numero: ");
    int numero = scanner.nextInt();

    // Imprimir la parte creciente del patrón
    for (int i = 1; i <= numero; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Imprimir la parte decreciente del patrón
    for (int i = numero - 1; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

