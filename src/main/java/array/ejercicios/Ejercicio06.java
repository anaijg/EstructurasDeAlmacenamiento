package array.ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 * Realizar un programa en el que se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10.
 * A continuación, mostrar la media de los números positivos, la media de los negativos y contar el número de ceros.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // creamos el array
        int[] numeros = new int[20];
        // lo rellenamos
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(-10, 11);
        }

        // media = suma de todos los números / cantidad de números
        // media de los números positivos -> suma positivos + nº positivos (contadorPositivos)
        // media de los números negativos -> suma negativos + nº negativos (contadorNegativos)
        // número de ceros (contadorCeros)

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        // la lógica es: recorro el array de principio a fin y con un if si el número es positivo va a una rama, si es negativo a otra, y si es 0 a otra rama
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                // necesitamos suma y contador
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                // necesitamos suma y contador
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else { // si no es positivo ni negativo, va a ser 0
                contadorCeros++;
            }
        }
        // ya estamos en condiciones de calcular todo
        double mediaPositivos = (double) sumaPositivos / (double) contadorPositivos;
        double mediaNegativos = (double) sumaNegativos / (double) contadorNegativos;

        System.out.println(Arrays.toString(numeros));

        System.out.println("Media de los positivos = " + mediaPositivos);
        System.out.println("Media de los negativos = " + mediaNegativos);
        System.out.println("Cantidad de ceros = " + contadorCeros);
    }
}
