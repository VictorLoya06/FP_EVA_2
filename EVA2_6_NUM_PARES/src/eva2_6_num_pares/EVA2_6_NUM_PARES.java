/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_num_pares;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_6_NUM_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num , fac ;
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce mayor numero: ");
        num= scanner.nextInt();
        System.out.print("Introduce menor numero: ");
        fac= scanner.nextInt();
        
         System.out.println("Los numeros pares entre " + fac + " y " + num + " son:");
        
        for (int i = fac + 1; i < num; i++) {
            if (i % 2 == 0) { // Verifica si el número es par
                System.out.print(i + ", ");
            }
        }
        
        System.out.print(".");
    }
    
}
