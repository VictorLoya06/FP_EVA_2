/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_arreglo;

/**
 *
 * @author noziv
 */
public class EVA2_13_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // int[]--> indica entreros
    // NEW int [10] --> crea el arregglo con 10 espacios para entreros
     int[]arreglo=new int [10];  
      // Asigna valores específicos a algunas posiciones
        arreglo[0] = 100;
        arreglo[9] = 900;
        
        // Asigna valores a todas las posiciones del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (i + 1) * 100; // Por ejemplo, 100, 200, 300, ...
        }
        
        // Imprime todos los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
    }
    
}}
