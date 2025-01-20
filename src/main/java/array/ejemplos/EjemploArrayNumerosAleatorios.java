package array.ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemploArrayNumerosAleatorios {
    public static void main(String[] args) {
        // voy a meter 300 números aleatorios entre 0 y 100 en un array
        int[] aleatorios = new int[300];
        // cómo generar un número aleatorio
        Random random = new Random(); // 1) creo un objeto random
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = random.nextInt(0, 101); // 2) llamo al método nextInt(min, max + 1);
        }
        System.out.println(Arrays.toString(aleatorios));
        // ordenamos el array en orden creciente
        Arrays.sort(aleatorios);

        System.out.println("\n\n");
        System.out.println(Arrays.toString(aleatorios));
    }
}
