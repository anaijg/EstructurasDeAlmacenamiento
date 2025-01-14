package string.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 5
 * Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        // tenemos que ver si empieza por J o j
        // hay dos formas de solucionarlo
        // 1) pasar la palabra a mayúsculas y ver si comienza por "J"
        cadena = cadena.toUpperCase();
        System.out.println(cadena.startsWith("J"));

        // 2) podemos poner un || y comparar con "j" y "J"
        if (cadena.startsWith("J") || cadena.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // 3) Más simple: imprimimos el resultados de la pregunta
        System.out.println(cadena.startsWith("J") || cadena.startsWith("j"));
    }
}
