/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32t2;

import java.util.Scanner;
/**
 *
 * @author Alberto
 * 
 */
public class Ejercicio32T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int dinero, cantidad, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1; // declaro las variables que voy a usar

        System.out.print("Por favor, indique una cantidad de dinero: "); // le pido una cantidad de dinero al usuario
        dinero = entrada.nextInt(); // igualo el valor que introduzca el usuario a la variable dinero

        cantidad = dinero; // igualo la variable cantidad a la de dinero para usar la variable dinero sin problema en los calculos

        billetes50 = dinero / 50; // divido el dinero que introduce el usuario entre 50 para saber cuantos billetes de 50 serán necesarios
        dinero = dinero % 50; // saco el resto de la división para continuar con los calculos

        billetes20 = dinero / 20; // divido el resto de la operación anterior entre 20 para saber cuantos billetes de 20 tendrá
        dinero = dinero % 20; // saco el resto de la división para continuar con los calculos

        billetes10 = dinero / 10; // divido el resto de la operación anterio entre 10 para saber cuantos billetes de 10 tendrá
        dinero = dinero % 10; // saco el resto de la división para continuar con los calculos

        billetes5 = dinero / 5; // divido el resto de la operación anterio entre 5 para saber cuantos billetes de 5 tendrá
        dinero = dinero % 5; // saco el resto de la división para continuar con los calculos

        monedas2 = dinero / 2; // divido el resto de la operación anterio entre 2 para saber cuantas monedas de 2 tendrá
        monedas1 = dinero % 2; // saco el resto de la división anterior para saber cuantas monedas de 1 tendrá

        System.out.println(cantidad + " Euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro.");
        // por último escribo en pantalla la cantidad de billetes y monedas que el usuario tendrá con la cantidad de dinero que haya ingresado
    }
    
}
