/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA2_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    Scanner captu = new Scanner(System.in);

    // Declaración de variables
    int victoriasUsuario = 0;
    int victoriasComputadora = 0;
    int empates = 0;
    boolean jugar = true;
    int eleccionUsuario;
    String eleccionUsuarioStr;

    while (jugar) {
        // Elección del usuario
        System.out.println("Elige una opcion: 1 para Piedra, 2 para Papel, 3 para Tijera. Ingresa 'salir' para terminar el juego.");
        eleccionUsuarioStr = captu.nextLine();

        // Verificar si el usuario desea salir
        if (eleccionUsuarioStr.equalsIgnoreCase("salir")) {
            jugar = false;
            break;
        }

        // Convertimos la entrada a número y validamos
        try {
            eleccionUsuario = Integer.parseInt(eleccionUsuarioStr);

            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Opcion invalida, elige 1, 2 o 3.");
                continue;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida, por favor elige 1, 2 o 3.");
            continue;
        }

        // Mostrar la elección del usuario
        switch (eleccionUsuario) {
            case 1: 
                System.out.println("Elegiste: Piedra");
            case 2:
                System.out.println("Elegiste: Papel");
            case 3:
                System.out.println("Elegiste: Tijera");
        }

        // Elección aleatoria de la computadora
        int eleccionComputadora = (int) (Math.random() * 33);

        // Mostrar la elección de la computadora
        switch (eleccionComputadora) {
            case 1 :
                System.out.println("La computadora eligio: Piedra");
            case 2 :
                System.out.println("La computadora eligio: Papel");
            case 3 :
                System.out.println("La computadora eligio: Tijera");
        }

        // Determinar el resultado de la partida
        if (eleccionUsuario == eleccionComputadora) {
            System.out.println("Empate!");
            empates++;
        } else if (
            (eleccionUsuario == 1 && eleccionComputadora == 3) || // Piedra gana a Tijera
            (eleccionUsuario == 2 && eleccionComputadora == 1) || // Papel gana a Piedra
            (eleccionUsuario == 3 && eleccionComputadora == 2)    // Tijera gana a Papel
        ) {
            System.out.println("Ganaste esta ronda!");
            victoriasUsuario++;
        } else {
            System.out.println("La computadora gana esta ronda!");
            victoriasComputadora++;
        }

        // Mostrar el marcador actual
        System.out.println("Marcador actual: Usuario " + victoriasUsuario + " - Computadora " + victoriasComputadora + " - Empates " + empates);
    }

    // Final del juego: mostramos los resultados finales
    System.out.println("\nJuego terminado.");
    System.out.println("Resultados finales: Usuario " + victoriasUsuario + " - Computadora " + victoriasComputadora + " - Empates " + empates);

    if (victoriasUsuario > victoriasComputadora) {
        System.out.println("Felicidades, ganaste mas partidas que la computadora!");
    } else if (victoriasComputadora > victoriasUsuario) {
        System.out.println("La computadora gano mas partidas, mejor suerte la proxima vez.");
    } else {
        System.out.println("¡Hubo un empate en el número de partidas ganadas!");
    }

    captu.close();
    }
}

       






       

           
            

            