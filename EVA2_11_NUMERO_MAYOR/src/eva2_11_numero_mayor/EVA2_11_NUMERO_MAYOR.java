/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_11_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

   Scanner captu = new Scanner(System.in);
        int num, mayor = Integer.MIN_VALUE;

    while (true) {
        System.out.println("Ingresa un numero (-1 para Finalizar):");
        num = captu.nextInt();

        if (num == -1) break; 

    //  número mayor
        if (num > mayor) mayor = num; 
    }

    System.out.println("El número mayor ingresado es: " + mayor);
    
    }
    }
    

