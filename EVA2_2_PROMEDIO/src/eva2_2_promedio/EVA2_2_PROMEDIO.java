/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;
import java.util.Scanner;
/**
 *
 * @author noziv
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int cal,calsu;
        Scanner captu = new Scanner(System.in);
      calsu=0;
        
        for(int i = 1;i<=10;i++){
           System.out.println("Estudiante"+ i);
                   
        System.out.println("¿Cual es tu clficacion?");
        cal=captu.nextInt();
        captu.nextLine();
        
        calsu=calsu+cal;
         System.out.println(calsu);
         double prom= calsu/10.0;
          System.out.println(prom + "PROMEDIO GENERAL");      
    }}
    
}
