package string.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 4
 * Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una ciudad (finaliza con 0)");
        String ciudad = scanner.nextLine();
        while (!ciudad.equals("0")) { // mientras lo introducido en ciudad no sea 0, sigo en el bucle
            System.out.println("Termina por \"burgo\"? " + ciudad.endsWith("burgo"));
            // antes de salir del bucle, me aseguro de introducir un nuevo valor para ciudad
            System.out.println("Introduce una ciudad (finaliza con 0)");
            ciudad = scanner.nextLine();
        }
    }
    // intenta hacerlo de forma que el bucle finalice cuando la ciudad finalice por "burgo"
}
