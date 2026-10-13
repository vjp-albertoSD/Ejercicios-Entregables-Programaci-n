/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09t3;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */

public class Ejercicio09T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt(); // guardo el primer numero del usuario

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt(); // guardo el segundo numero del usuario

        System.out.print("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt(); // guardo el tercer numero del usuario

        System.out.print("Por último, introduzca un cuarto numero: ");
        int num4 = entrada.nextInt(); // guardo el cuarto numero del usuario

        int aux; // creo una variable auxiliar para intercambiar los numeros

        if (num1 > num2) { // compruebo si el primer numero es mayor que el segundo
            aux = num1; // guardo el primer numero en la variable auxiliar
            num1 = num2; // pongo el segundo numero en la primera posicion
            num2 = aux; // pongo el primer numero en la segunda posicion
        }

        if (num1 > num3) { // compruebo si el primer numero es mayor que el tercero
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num1 > num4) { // compruebo si el primer numero es mayor que el cuarto
            aux = num1;
            num1 = num4;
            num4 = aux;
        }

        if (num2 > num3) { // compruebo si el segundo numero es mayor que el tercero
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        if (num2 > num4) { // compruebo si el segundo numero es mayor que el cuarto
            aux = num2;
            num2 = num4;
            num4 = aux;
        }

        if (num3 > num4) { // compruebo si el tercer numero es mayor que el cuarto
            aux = num3;
            num3 = num4;
            num4 = aux;
        }

        
        System.out.println("El orden de los números introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4); // muestro los cuatro numeros ordenados de menor a mayor
    }
    
}
