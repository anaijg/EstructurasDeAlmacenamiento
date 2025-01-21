package arraysbidimensionales.ejemplos;

public class EjemplosBidimensionales {
    public static void main(String[] args) {
        // un array bidimensional es un array cuyos elementos son otros arrays
        // son perfectos para modelar una estructura tipo tabla, e.d., algo que tenga filas y columnas: tableros, matrices

        // todos los elementos del array bidimensional son del mismo tipo: int, String, double...

        // cómo se crean
        // tipoDeDato[][] ->
        // el primer [] son las filas
        // el segundo [] son las columnas

        // forma 1:
        int[][] tabla1 = {
                {1, 2, 3, 1}, // primer array de enteros (1ª fila = [0][])
                {3, 4, 1, 2}, // segundo array de enteros (2a fila = [1][]
                {4, 4, 1, 0}  // tercer array de enteros (3º fila = [2][]
        };

        // forma 2
        int[] fila1 = new int[4]; // [0, 0, 0, 0]
        int[] fila2 = new int[4];
        int[] fila3 = new int[4];

        // estos tres arrays los meto en uno bidimensional
        int[][] tabla2 = { fila1, fila2, fila3};

        // forma 3: desde 0
        int filas = 3; // filas se corresponde con i
        int columnas = 4; // columnas se corresponde con j
        int[][] tabla3 = new int[filas][columnas];

        // en todos los casos la tabla sería:
        // x x x x i son las filas
        // x x x x j son las columnas
        // x x x x

        char[][] tablaChar = new char[3][4];

        // cómo recorremos un array (para imprimirlo, para seleccionar algunos valores que cumplan una condición, etc.
        // se recorren con un for anidado
        // esto es, un for dentro de otro for
        // el tamaño de un array bidimensional es el número de filas que tiene, esto es, el número de arrays que contiene
        for (int i = 0; i < tabla1.length; i++) { // for externo, el índice llevas las filas
            for (int j = 0; j < tabla1[i].length; j++) {
                System.out.print(tabla1[i][j] + " ");
            }
            // si queremos que cada fila se imprima en una ídem, cada vez que terminamos de recorrerla metemos un salto de línea
            System.out.println();
        }
        // si quisiera acceder a un elemento concreto: array[i][j]
        System.out.println("\n\n");
        System.out.println(tabla1[2][3]);

        System.out.println(tabla1[1][2]);

        // por último, los arrays dentro de un array bidimensional no tienen por qué tener todos la misma longitud
        int[][] tabla4 = new int[3][];// dejo en blanco el número de columnas

        tabla4 [0] = new int[] { 1, 2, 3, 4 }; // la primera fila tiene longitud 4
        tabla4 [1] = new int[] { 5, 7, 3};     // la segunda fila tiene longitud 3
        tabla4 [2] = new int[] { 8 };          // la tercera fila tiene longitud 1

        // vamos a imprimir todos los elementos de este array bidimensional
        System.out.println("\n\n");
        for (int i = 0; i < tabla4.length; i++) {
            for (int j = 0; j < tabla4[i].length; j++) {
                System.out.print(tabla4[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
