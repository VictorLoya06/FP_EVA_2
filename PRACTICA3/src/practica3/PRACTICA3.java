/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class PRACTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner captu = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String cadena = captu.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) 
          System.out.println(cadena.charAt(i));  
    }}
    

