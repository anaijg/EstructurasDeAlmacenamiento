package array.ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 * Hacer un programa que inicialice una lista (array) de números con valores aleatorios (10 valores), y los muestre ordenados de menor a mayor.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        // lo creamos
        int[] numeros = new int[10];
        Random random = new Random();
        // lo rellenamos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt();
        }
        // lo imprimimos antes de ordenar
        System.out.println(Arrays.toString(numeros));
        // lo ordenamos
        Arrays.sort(numeros);
        // lo imprimimos
        System.out.println(Arrays.toString(numeros));
    }
}
