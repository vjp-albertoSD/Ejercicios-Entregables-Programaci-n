/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27t3;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Ejercicio27T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1; //introduzco las variables que utilizaré en el programa 
        int num2;
        int opcion;
        
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt(); // guardo el primer numero del usuario
        
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt(); // guardo el segundo numero del usuario
        
        do{ // creo el menú con un do while
            System.out.println("Pulse 1 para sumar los numeros"); // le digo por pantalla al usuario que numero tiene que escribir para las diferentes opciones del menu
            System.out.println("Pulse 2 para restar los numeros"); 
            System.out.println("Pulse 3 para multiplicar los numeros");
            System.out.println("Pulse 4 para dividir los numeros");
            System.out.println("Pulse 5 para salir");
            opcion = entrada.nextInt();
            
            switch (opcion){ // añado las opciones con la variable opcion para que el usuario elija la que quiere 
                case 1 : {
                    int suma = num1 + num2;
                    System.out.println("El resultado de sumar ambos numeros es " + suma);
                    break;
                }
                case 2 : {
                    int resta = num1 - num2;
                    System.out.println("El resultado de restar ambos numeros es " + resta);
                    break;
                }
                case 3 : {
                    int multiplicacion = num1 * num2;
                    System.out.println("El resultado de multiplicar ambos numeros es " + multiplicacion);
                    break;
                }
                case 4 : {
                    try{ // con este try añado lo que puede dar problema al dividir el numero entre 0
                        int division = num1 / num2;
                    System.out.println("El resultado de dividir ambos numeros es " + division);
                    }catch(ArithmeticException e){ // le doy la solucion a su problema con el catch
                        System.out.println("El resultado de dividir entre 0 no esta definido");
                    }
                    
                    break;
                }
                case 5 : {
                    System.out.println("Hasta pronto!");
                    break;
                }
                default : {
                    System.out.println("Te has equivocado de opcion");
                    break;
                }
            }
        }while(opcion != 5); // con el while hago que cuando el usuario pulse el numero 5 se cierre el programa
        
    }
    
}
