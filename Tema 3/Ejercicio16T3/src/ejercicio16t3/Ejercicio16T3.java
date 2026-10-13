/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t3;

/**
 *
 * @author Alberto
 */
public class Ejercicio16T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int contador = 0; // declaro la variable contador

        System.out.println("Los números impares existentes entre el número 20 y el 160 son:");

        for (int i = 20; i <= 160; i++) { // pongo un for para mostrar por pantalla los numeros del 20 al 160
            if (i % 2 != 0) { // con el if declaro que si el resto al dividir entre 2 no es 0 (es decir, impar), se ejecute lo siguiente:
                System.out.println(i + " - ");// un sout para escribir por pantalla los numeros que sean impares y un - como separador entre los numeros
                contador++; // voy sumando la variable contador cada vez que se cumple la condicion del if, para que vaya sumando los numeros impares que hay
            }
        }

        System.out.println("\nLa cantidad de números impares impresos han sido: " + contador); // por ultimo en este sout pongo la cantidad de impares que hay entre 20 y 160
    }
    
}
