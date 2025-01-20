package array.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creo una array para guardar después los números
        double[] numeros = new double[5];
        // ahora lo relleno con los números que entren por teclado
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
        }
        // aquí es donde cambia respecto al ejercicio anterior
        // no hay métodos en Arrays que sirvan para esto
        // lo que vamos a hacer es recorrer el array del último índice al primero, imprimiendo lo que encontremos
        for (int i = numeros.length -1 ; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
