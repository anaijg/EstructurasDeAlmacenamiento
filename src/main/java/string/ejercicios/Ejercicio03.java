package string.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 3
 * Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        // reemplazamos todas las ocurrencias de 'a' por 'b'
        cadena = cadena.replace("a", "b");
        System.out.println(cadena);
    }
}
