package string.ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería imprimir true si son iguales, false en caso contrario.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
            // hola ke ase
            // ho Lakea se
        // si quitamos los espacios ya se quedan igual
        Scanner scanner = new Scanner(System.in);
        String cadena1 = scanner.nextLine();
        String cadena2 = scanner.nextLine();
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
    }
}
