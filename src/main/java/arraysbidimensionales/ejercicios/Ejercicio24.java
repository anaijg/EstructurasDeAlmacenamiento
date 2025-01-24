package arraysbidimensionales.ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
// 1. Pedir un día y un mes, y comprobar que es correcto. Consideramos que febrero tiene siempre 28 días.
//·   	Si la fecha introducida no es correcta, se informa de ello y se vuelve a pedir un día y un mes, hasta que se introduzca una fecha adecuada
        Scanner scanner = new Scanner(System.in);

        boolean fechaCorrecta = false; // false -> si mete bien el día lo cambio a true
        // dia y mes las declaro fuera del bloque do while para poder utilizarlas después fuera del mismo
        int dia; // 0
        String mes = ""; // null
        do {
            System.out.print("Introduce día del mes: ");
            dia = scanner.nextInt(); scanner.nextLine();
            System.out.print("Introduce el mes: ");
            mes = scanner.nextLine().toLowerCase();
            // tenemos que comprobar que el día introducido es correcto:
            // enero -> 31, febrero -> 28 -> marzo -> 31...


            boolean fecha31DiasCorrecta = (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre"))
                    &&
                    (dia >= 1 && dia <= 31);

            boolean fecha30DiasCorrecta = (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre"))
                    &&
                    (dia >= 1 && dia <= 30);

            boolean fecha28DiasCorrecta = mes.equals("febrero") && (dia >= 1 && dia <= 28);

            if (fecha31DiasCorrecta || fecha30DiasCorrecta || fecha28DiasCorrecta) {
                fechaCorrecta = true;
            }

            if (!fechaCorrecta) { //  fechaCorrecta = false
                System.out.println("Fecha incorrecta. Vuelve a introducir dia y mes");
            }
        } while (!fechaCorrecta); // fechaCorrecta = false

        // 2.  A continuación, se muestra un mensaje como el siguiente, en el que se indica el mes con letras:
        System.out.println("\n\nAsientos disponibles para el día " + dia + " de " + mes);

        // 3.  Los asientos están representados por un array bidimensional de caracteres, de tamaño 4x4, donde una L indica que el asiento está libre, y una X indica que está ocupado. Inicialmente, algunos asientos están libres y otros ocupados:
    }
}
