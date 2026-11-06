package ejercicio26t4;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Ejercicio26T4{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero; // declaro la variable numero

        System.out.print("Introduce un número entero: "); // le pido un numero al usuario
        numero = entrada.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El " + numero + " es un número primo.");
        } else {
            System.out.println("El " + numero + " no es un número primo.");
        }
    }

    
    public static boolean esPrimo(int numero) { // en este metodo devuelvo true si el número es primo y false si no lo es
        boolean primo = true;

        
        if (numero < 2) { // el 0 el 1 y los negativos no son primos 
            primo = false;
        }

        
        for (int i = 2; i < numero; i++) {// con este if busco divisores desde el 2 hasta el número anterior
            if (numero % i == 0) {
                primo = false;
            }
        }

        return primo; // devuelvo los primos
    }
}
