/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class PRACTICA2 {

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
        
        int vl1=fac;
        
        System.out.println("Los numeros entre "+ fac + " y "+ num +" son: ");
         vl1= vl1;
        for (int i =fac+1; i < num; i++) {
        vl1= vl1+ 1;
        int modulo =i %2;
        if(modulo=0);
        continue;
        System.out.print(vl1+",");}
       
        System.out.print(".");
    }
    
}
