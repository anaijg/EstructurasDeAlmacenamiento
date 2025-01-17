package array;

import java.util.Arrays;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        // si quiero recorrer un array, por ejemplo, para elevar al cuadrado (aquí el Arrays.toString() no vale) sus elementos e imprimirlos, lo primero que se nos ocurre es un for
        Random random = new Random();
        int[] numeros = new int[20];
        // rellenamos el array con nºs aleatorios entre 10 y 35
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10, 36);
        }
        System.out.println(Arrays.toString(numeros));

        // imaginemos que queremos mostrar los números del array, pero elevados al cuadrado
        System.out.print("\nCon for: ");
        for (int i = 0; i < numeros.length; i++) {
            //int cuadrado = numeros[i] * numeros[i]; // otra forma
            int cuadrado = (int) Math.pow(numeros[i], 2); // casting sin problema porque el número mayor será 1276
            System.out.print(cuadrado + " ");
        }

        // esto lo podríamos haber hecho más cortito con un foreach
        /*
        Sintaxis:
            for (tipoArray nombreQueYoQuiera : nombreArray) { // nombreQueYoQuiera representa a un elemento
                //instrucciones sobre el array
            }
         */
        System.out.print("\nCon foreach: ");
        for (int elemento: numeros) { // es lo mismo que decir: para cada elemento de numeros
            System.out.print((elemento * elemento) + " ");
        }
    }
}
