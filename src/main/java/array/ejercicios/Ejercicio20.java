package array.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dos cadenas de texto, se consideran anagramas si contienen exactamente los mismos caracteres con las mismas frecuencias. Para este desafío, la prueba no distingue entre mayúsculas y minúsculas. Por ejemplo, los anagramas de CAT son CAT, ACT, tac, TCA, aTC y CtA.
 * Introduce dos palabras por teclado en la misma línea y, si son anagramas imprime que lo son. Si no, imprime que no lo son.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        // introducimos las dos palabras separadas por espacio en la misma línea
        Scanner scanner = new Scanner(System.in);
        // 1) leo la línea, la paso a minúsculas y luego a divido en palabras para guardarla en un String[]
        String[] palabras = scanner.nextLine().toLowerCase().split(" ");
        // tengo un array con dos palabras
        //System.out.println(Arrays.toString(palabras));
        // idea: ordenamos las dos palabras por orden alfabético
        // acta -> aact
        // taca -> aact
        // 1) Tengo las palabras como String y esto es inmutable
        // hay un méto-do que te convierte una palabra en un array de caracteres
        // string.toCharArray()
        String palabra1 = palabras[0];
        String palabra2 = palabras[1];
        // y ahora convierto cada una en un array de caracteres
        char[] caracteres1 = palabra1.toCharArray(); // [a, c, t, a]
        char[] caracteres2 = palabra2.toCharArray(); // [t, a, c, a]
        // ahora los ordeno
        Arrays.sort(caracteres1); //[a, a, c, t]
        Arrays.sort(caracteres2); // [a, a, c, t]
        // si tras ordenarlos los comparo (equals()) y resulta que son iguales es que tienen las mismas letras con la misma frecuencia -> son anagramas
        boolean sonIguales = Arrays.equals(caracteres1, caracteres2);
        if (sonIguales) { // es lo mismo que if (sonIguales == true)
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }


    }
}
