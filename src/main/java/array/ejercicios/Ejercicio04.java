package array.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Longitud del array: ");
        int tamaño = scanner.nextInt();

        // creo un array de ese tamaño
        int[] numeros = new int[tamaño];

        // lo inicializamos con números aleatorios entre 1 y 10
        // podemos aprovechar y ya que creamos los números que se van a sumar, lo metemos en el mismo for

        Random random = new Random();
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            // guardamos el número aleatorio en el array
            numeros[i] = random.nextInt(1, 11);
            // además, luego lo vamos sumando y así acumulamos número a número
            suma += numeros[i]; // suma = suma + numeros[i]
        }
        System.out.println("Elementos del array: " + Arrays.toString(numeros));
        System.out.println("Suma de todo el array: " + suma);
    }
}
