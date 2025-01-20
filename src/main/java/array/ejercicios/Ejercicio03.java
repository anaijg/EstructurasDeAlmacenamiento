package array.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declaramos tres arrays de 5 enteros cada uno
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        int[] a3 = new int[5];

        // pedimos valores para a1 y a2
        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] =");
            a1[i] = scanner.nextInt();
            System.out.print("a2[" + i + "] =");
            a2[i] = scanner.nextInt();
            // aprovechamos y rellenamos el elemento a3
            a3[i] = a1[i] + a2[i];
        }
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        System.out.println("a3 = " + Arrays.toString(a3));
    }
}
