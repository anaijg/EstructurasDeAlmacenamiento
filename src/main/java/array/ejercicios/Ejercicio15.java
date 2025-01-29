package array.ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 * @author AnaIJim
 * Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar en otro array los elementos pares del primero, y, a continuación, los elementos impares.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        // para que no se nos vaya de las manos los números van de 1 a 100
        int[] numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1, 101);
        }
        System.out.println(Arrays.toString(numeros));
        // creamos otro array para guardar pares y luego impares
        int[] paresImpares = new int[numeros.length];
        int indiceParesImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                paresImpares[indiceParesImpares] = numeros[i];
                // tenemos que desplazar el índice a la derecha para que no se sobreescriba el siguiente número par
                indiceParesImpares++;
            }
        }
        //System.out.println(Arrays.toString(paresImpares));
        // ahora seguimos rellenando paresImpares con los impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                paresImpares[indiceParesImpares] = numeros[i];
                indiceParesImpares++;
            }
        }
        System.out.println(Arrays.toString(paresImpares));
    }
}
