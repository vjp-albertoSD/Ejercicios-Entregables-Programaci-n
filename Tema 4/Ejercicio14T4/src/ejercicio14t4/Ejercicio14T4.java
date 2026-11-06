package ejercicio14t4;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Ejercicio14T4{

    public static void main(String[] args){
        int numero; // declaro la variable numero

        
        do { // pido el número hasta que sea mayor que 0
            numero = pedirNumero();
        } while (!esMayorQueCero(numero));

        mostrarMultiplos(numero); // muestro los multiplos del numero llamando al metodo
    }

    
    public static int pedirNumero(){ // en este metodo pido un número al usuario y lo devuelve
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número mayor que 0: ");
        int numero = entrada.nextInt();
        return numero;
    }

    
    public static boolean esMayorQueCero(int numero) { // en este metodo compruebo si el número es mayor que 0 y si no, avisa del error
        boolean correcto = true;
        if(numero <= 0){
           System.out.println("Error: el número debe ser mayor que 0.");
           correcto = false;
        }
        return correcto;
    }

    
    public static void mostrarMultiplos(int numero){ // en este metodo muestro los múltiplos de 3 entre 1 y el número y cuántos hay
        int contador = 0;

        System.out.println("Múltiplos de 3 entre 1 y " + numero + ": ");
        for(int i = 1; i <= numero; i++){
            if(i % 3 == 0){
               System.out.println(i);
               contador++;
            }
        }
        System.out.println("Total de números mostrados: " + contador);
    }
}
