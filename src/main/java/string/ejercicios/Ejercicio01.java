package string.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 1
 * Escribir por pantalla cada carácter de una cadena introducida por teclado.
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // introducimos una cadena por teclado
        String cadena = scanner.nextLine();
        // utilizamos for para recorrer la cadena de principio a fin
        for (int i = 0; i < cadena.length(); i++) {
            // imprimimos cada carácter
            System.out.println(cadena.charAt(i));
        }
    }
}
