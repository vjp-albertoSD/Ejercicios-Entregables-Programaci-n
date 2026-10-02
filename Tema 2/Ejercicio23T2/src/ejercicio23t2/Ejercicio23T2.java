/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23t2;


import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class Ejercicio23T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        double precio, total; // introducimos las variables
        int unidades;

        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: "); // le preguntamos el precio del producto al usuario
        precio = entrada.nextDouble();

        System.out.print("¿Cuántas unidades quiere llevarse? "); // le preguntamos cuantas unidades va a llevar de cada producto
        unidades = entrada.nextInt();

        total = precio * unidades; // realizamos el calculo para saber cuanto tiene que pagar el usuario

        System.out.println("El precio total de su compra es de: " + total + " Euros."); // le damos su precio final
    }
    
}
