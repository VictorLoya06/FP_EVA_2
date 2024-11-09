/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencias;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_3_POTENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int base,ex;
        Scanner captu = new Scanner(System.in);
      
      
           System.out.println("base:");
           base=captu.nextInt();
        captu.nextLine();
         System.out.println("exponete:");
         ex=captu.nextInt();
         captu.nextLine();
       int resu;
        
          resu=1 ;
        for(int i = 1;i<=ex;i++)
        resu= resu * base;
       System.out.println("resultado"+ resu);
       }}
    
    

