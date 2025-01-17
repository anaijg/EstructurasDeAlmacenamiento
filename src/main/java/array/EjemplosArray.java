package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EjemplosArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Un array (o vector, o arreglo, o también puede llamarse lista en algunos contextos) es un conjunto de elementos del mismo tipo, que se almacenan en la memoria de forma secuencial bajo un mismo nombre (el nombre del array).
        //[Nota: un conjunto de variables de distinto tipo almacenados en la memoria bajo un mismo nombre es un objeto; lo veremos en la Programación Orientada a objetos]
        //El número de elementos a almacenar se establece cuando se crea el array, y no se puede modificar.

        String[] strings = getStrings();

        //  imprimir el array completo
        System.out.println(Arrays.toString(strings));


        // otra forma es crear el array y a la vez inicializarlo
        int[] nums = { 1, 2, 3, 4 }; // instanciación e inicialización con 1, 2, 3, 4
        System.out.println(Arrays.toString(nums));

        // para obtener la longitud (tamaño) del array:
        System.out.println(strings.length);
        System.out.println(nums.length);

        // acceder a los elementos del array por su índice
        nums[1] = nums[0] + nums[1]; // que se guarda en nums[1] = 1 + 2 <- 3
        System.out.println(Arrays.toString(nums));

        // además de Arrays.toString hay métodos de la clase Arrays que nos facilitan la vida:
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        // para comparar arrays: dos arrays son iguales si tienen los mismos elementos en el mismo orden:
        String[] duplicadoNombres = strings.clone(); // clone de clona el array que le digas
        System.out.println(Arrays.equals(strings, duplicadoNombres));


        // para recorrer un array (para imprimirlo, para ver si están tales elementos...)
        // queremos contar cuántos nombres empiezan por D
        int contador = 0;
        for (int i = 0; i < strings.length; i++) { // si el array tiene 10 elementos sería: i < 10 -> pararía en 9
            if (strings[i].startsWith("D")) {
                System.out.println(strings[i]);
                contador++;
            }
        }
        System.out.println("Hay " + contador + " nombres que empiezan por D.");

        System.out.println("Ahora vamos a rellenar un array por teclado: ");
        String[] arrayMetidoPorTeclado = crearArray();
        System.out.println(Arrays.toString(arrayMetidoPorTeclado));
    }

    public static String[] crearArray() {
        // pedimos el tamaño del array
        System.out.println("Tamaño del array: ");
        int tamaño = scanner.nextInt(); scanner.nextLine();// 5
        // crear array
        String[] strings = new String[tamaño]; // [0, 0, 0, 0, 0]
        // lo quiero rellenar ->
        for (int i = 0; i < tamaño; i++) {
            strings[i] = scanner.nextLine();
        }

        return strings;
    }

    private static String[] getStrings() {
        System.out.print("Tamaño del array: ");
        int tamaño = scanner.nextInt(); // meto 10
        // quiero crear un array de ese tamaño
        String[] strings = new String[tamaño]; // creo un array de tamaño 10, es decir, 10 casillas o posiciones
        //Sin embargo, cualquier elemento almacenado en un array puede modificarse (a diferencia de los String). A los elementos accedemos a través de su índice.
        // |  [0]  | [1]   | [2]| [3]| [4]| [5]| [6] | [7]| [8] |[9] |
        // vamos a rellenar el arry

        // en la primera posición introduzco un nombre
        strings[6] = "Eduardo";
        strings[0] = "Kevin";
        strings[4] = "Pedro";
        strings[1] = "Alejandro";
        strings[2] = "Marcos";
        strings[8] = "César";
        strings[3] = "Daniel";
        strings[5] = "David";
        strings[7] = "Aarón";
        strings[9] = "Pablo";
        //strings[10] = "Pablo"; // este ya no cabe
        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase();
        }
        return strings;
    }

}
