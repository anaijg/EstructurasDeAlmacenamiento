package array.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creo una array para guardar después los números
        double[] numeros = new double[5];
        // ahora lo relleno con los números que entren por teclado
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(numeros));
    }
}
