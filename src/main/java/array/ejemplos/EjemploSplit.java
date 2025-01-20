package array.ejemplos;

import java.util.Scanner;

public class EjemploSplit {
    public static void main(String[] args) {
        // el método String.split() te coge una cadena de texto, te lo trocea por el carácter que le indiques (por ejemplo, un espacio -" "-) y te mete los trozos en un String[]

        // por ejemplo: meto una lista de frutas por teclado separadas por " " y con split() obtengo un array de frutas.
        Scanner scanner = new Scanner(System.in);
        String linea = scanner.nextLine(); // manzana naranja plátano pera uva fresa mango piña sandía kiwi melón papaya limón mandarina guayaba granada higo maracuyá coco ciruela durazno
        System.out.println(linea);
        String[] frutas = linea.split(" ");
        int indice = 0;
        for (String elemento: frutas) {
            // en cada vuelta imprimo el índice y la fruta que está en ese índice
            System.out.println(indice + " " + elemento);
            indice++;
        }
    }
}
