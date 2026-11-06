package ejercicio17t4;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Ejercicio17T4 {

    public static void main(String[] args) {
        char letraSecreta; // declaro las variablea
        char letraUsuario;
        int intentos = 0;

        letraSecreta = generarLetra();

        System.out.println("--- ADIVINA LA LETRA ---");
        
        do{ // con este do while repito los intentos hasta que le usuario adivine la letra
            letraUsuario = pedirLetra();
            intentos++;
            comprobarLetra(letraSecreta, letraUsuario);
        }while(letraUsuario != letraSecreta);

        mostrarResultado(intentos); // muestro el numero de intentos 
    }

    
    public static char generarLetra(){// en este metodo genero una letra aleatoria entre la a y la z
        int codigo = (int) (Math.random() * 26) + 97;
        char letra = (char) codigo;
        return letra;
    }

    
    public static char pedirLetra(){ // en este metodo pido una letra al usuario y la devuelve
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }

   
    public static void comprobarLetra(char letraSecreta, char letraUsuario){  // en este metodo comparo la letra del usuario con la secreta y da una pista
        if (letraUsuario < letraSecreta) {
            System.out.println("La letra que buscas está despues en el alfabeto");
        } else if (letraUsuario > letraSecreta) {
            System.out.println("La letra que buscas está antes en el alfabeto");
        } else {
            System.out.println("¡Enhorabuena! Has adivinado la letra");
        }
    }

    
    public static void mostrarResultado(int intentos){ // en este metodo muestro el número de intentos
        System.out.println("Has necesitado " + intentos + " intentos");
    }
}
