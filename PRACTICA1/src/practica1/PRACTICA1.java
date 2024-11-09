/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int ex;
       String base;
        Scanner captu = new Scanner(System.in);
      
      
           System.out.println("palabra");
           base=captu.nextLine();
        
         System.out.println("repeticiones");
         ex=captu.nextInt();
         captu.nextLine();
       String  resu;
          resu="" ;
        for(int i = 1;i<=ex;i++)
        resu= resu + " " + base;
       System.out.println("resultado"+ resu);     
        
    }
    
}
