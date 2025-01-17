package array;

import java.util.Random;

public class EjemploNumerosAleatorios {
    public static void main(String[] args) {
        // quiero un array de 30 números generados aleatoriamente entre 1 y 100

        // cómo generar un número aleatorio
        Random random = new Random(); // 1) creo un objeto random
        for (int i = 0; i < 300; i++) {
            int numero = random.nextInt(0, 101); // 2) llamo al método nextInt(min, max + 1);
            System.out.print(numero + "\t");
        }
    }
}
