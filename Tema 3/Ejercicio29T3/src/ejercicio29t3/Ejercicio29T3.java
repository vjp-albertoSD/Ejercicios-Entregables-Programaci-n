/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio29t3;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Ejercicio29T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        double aleatorio = Math.random() * 100 + 1; // genero un numero aleatorio entre 1 y 100
        aleatorio = Math.floor(aleatorio); // redondeo el numero aleatorio al entero inferior
        int numero = (int) aleatorio; // convierto el numero aleatorio en un entero

        int num; // creo la variable donde guardare el numero del usuario
        int intentos = 0; // creo una variable para contar los intentos del usuario

        do { // creo un do while para que el usuario pueda intentar adivinar el numero
            System.out.print("Adivina el numero entre 1 y 100: ");
            num = entrada.nextInt(); // guardo el numero introducido por el usuario
            intentos++; // aumento el contador de intentos

            if (num > numero) { // compruebo si el numero introducido es mayor que el aleatorio
                System.out.println("El numero que tienes que adivinar es menor");
            } else if (num < numero) { // compruebo si el numero introducido es menor que el aleatorio
                System.out.println("El numero que tienes que adivinar es mayor");
            } else { // si el numero introducido es igual al aleatorio significa que ha acertado
                System.out.println("Enhorabuena, has adivinado el numero");
                System.out.println("Has necesitado " + intentos + " intentos");
            }

        } while (num != numero); // repito el bucle mientras el usuario no adivine el numero

    }

}

