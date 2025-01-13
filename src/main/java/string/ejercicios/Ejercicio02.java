package string.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 2
 * Realizar un programa que compruebe si una cadena leída por teclado comienza por otra cadena introducida también por teclado.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pido una cadena por teclado
        String cadena = scanner.nextLine();
        // pido otra cadena por teclado
        String otraCadena = scanner.nextLine();
        // comienza por ---> startsWith()
        // compruebo si la primera cadena comienza por la segunda cadena
        System.out.println(cadena.startsWith(otraCadena));

        // cuatro métodos a observar aquí:
        // equals -> true si las dos cadenas son idénticas
        // startsWith -> true si la primera cadena comienza por la segunda
        // endsWith -> true si la primera cadena termina por la primera
        // contains -> true si la primera cadena contiene a la segunda

    }
}
