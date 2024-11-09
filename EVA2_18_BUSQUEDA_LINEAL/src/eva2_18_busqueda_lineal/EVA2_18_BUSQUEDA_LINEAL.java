/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int[] datos = {6, 8, 41, 97, 62, 85, 6};
        int valor, posi = -1;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Valor a buscar:");
        valor = captu.nextInt();
        
        // Búsqueda del valor en el arreglo
        for (int i = 0; i < datos.length; i++) { 
            if (valor == datos[i]) {
                posi = i;
                break; // Detener el bucle al encontrar el valor
            }}
        
        // Mostrar el resultado de la búsqueda
        if (posi == -1) {
            System.out.println("Valor no encontrado");
        } else {
            System.out.println("Posición del valor: " + posi);

}}}
