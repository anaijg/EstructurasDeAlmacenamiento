package array.ejemplos;

public class OjoConElCastingDeDoubleAInt {
    public static void main(String[] args) {
        // Usaremos un número que ocupe exactamente 50 bits
        double numero = 123456789023156.789222;
        double numero2 = 36 * 36;

        // Convertir a binario
        long bits = Double.doubleToLongBits(numero);
        String binario = Long.toBinaryString(bits);

        // Asegurar que tenga 50 bits
        binario = binario.substring(binario.length() - 50);

        System.out.println("Número decimal: " + numero);
        System.out.println("Representación binaria (50 bits): " + binario);

        // Convertir a binario
        long bits2 = Double.doubleToLongBits(numero2);
        String binario2 = Long.toBinaryString(bits2);

        System.out.println("Número decimal: " + numero2);
        System.out.println("Representación binaria (50 bits): " + binario2);

        // hacemos casting de ambos números
        int entero1 = (int) numero; // numero es double, lo convertimos a int
        System.out.println("Número que no cabe: " + entero1);
        int entero2 = (int) numero2; // numero es double, lo convertimos a int
        System.out.println("Número que sí cabe: " + entero2);



    }
}
