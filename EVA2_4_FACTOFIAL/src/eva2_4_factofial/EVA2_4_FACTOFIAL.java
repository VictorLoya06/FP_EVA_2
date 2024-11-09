/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factofial;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_4_FACTOFIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int num;
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        
        num= scanner.nextInt();
        
        // Variable para almacenar el factorial, iniciando en 1
        int fac = 1;
        
        
        for (int i = 1; i <= num; i++) {
            fac *= i; 
        }
        
        // Mostrar el resultado
        System.out.println("El factorial de " + num + " es: " + fac);
                
    }
    
}
