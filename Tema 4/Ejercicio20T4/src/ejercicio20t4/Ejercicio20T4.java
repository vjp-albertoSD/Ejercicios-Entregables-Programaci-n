package ejercicio20t4;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Ejercicio20T4 {

    
    final static String RESPUESTA1 = "Madrid"; // declaro las respuestas correctas
    final static String RESPUESTA2 = "Colón";

    public static void main(String[] args){
        int nota; // declaro la variable nota

        System.out.println("EXAMEN DE CULTURA GENERAL");

        nota = pregunta1() + pregunta2(); // calculo la nota del examen sumando los resultados de las preguntas

        System.out.println("NOTA: " + nota);
    }

    
    public static int pregunta1(){ // En este metodo hago la primera pregunta y devuelvo 5 si acierta o 0 si falla
        Scanner entrada = new Scanner(System.in);
        int puntos;

        System.out.print("pregunta 1: ¿Cual es la capital de España?: ");
        String respuesta = entrada.nextLine();

        if(respuesta.equalsIgnoreCase(RESPUESTA1)){
           System.out.println("Muy bien, respuesta correcta");
           puntos = 5;
        } else{
           System.out.println("No es correcto. La respuesta correcta es: " + RESPUESTA1);
           puntos = 0;
        }
        return puntos;
    }

    
    public static int pregunta2(){ // en este metodo hago la segunda pregunta y devuelvo 5 si acierta y 0 si falla
        Scanner entrada = new Scanner(System.in);
        int puntos;

        System.out.print("pregunta 2: ¿Quién descubrio America?: ");
        String respuesta = entrada.nextLine();

        if(respuesta.equalsIgnoreCase(RESPUESTA2)){
           System.out.println("Muy bien, respuesta correcta");
           puntos = 5;
        } else{
           System.out.println("No es correcto. La respuesta correcta es: " + RESPUESTA2);
           puntos = 0;
        }
        return puntos;
    }
}
