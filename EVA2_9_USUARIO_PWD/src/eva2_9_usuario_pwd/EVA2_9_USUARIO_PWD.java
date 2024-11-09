/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    final String USUARIO = "Admin";
       final String PASSWORD = "321";
        String U,PWD,Pass;
        Scanner captu=new Scanner(System.in);
      do{
        System.out.println(" USUARIO");
        U=captu.nextLine();
        System.out.println(" PASSWORD");
        PWD=captu.nextLine();
       }while(!(U.equals("Admin") && PWD.equals("321")));
       
       
        System.out.println(" BIENVENIDO");    
    }
    
}
