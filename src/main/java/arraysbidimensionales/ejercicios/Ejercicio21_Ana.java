package arraysbidimensionales.ejercicios;

/**
 * Haz un programa que realice lo siguiente:
 * Crea un array bidimensional de 5x5 enteros y nombre ‘diagonal’.
 * Rellénalo de forma que los componentes pertenecientes a la diagonal de la matriz tomen el valor 1 y el resto el valor 0.
 * Muestra el contenido del array en pantalla.
 */
public class Ejercicio21_Ana {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if(i == j) {
                    diagonal[i][j] = 1;
                }
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
