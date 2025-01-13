package string;

public class EjemplosString {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Numero: " + numero);

        // String y tipos referencia
        String palabra = null; // null -> esa variable no se ha inicializado
        String otraPalabra = ""; // es un String vacío, sí se ha inicializado
        //System.out.println("Palabra null: " + palabra.length()); -> nullpointerexception

        // métodos
        String palabra1 = "Programación";
        String palabra2 = "Programacion";
        // longitud del string
        System.out.println(otraPalabra.length());
        System.out.println(palabra1.length());
        System.out.println(palabra2.length());

        // obtener un carácter por su índice
        // quiero el último carácter (posición palabra.length() - 1) de palabra1
        System.out.println(palabra1.charAt(palabra1.length() - 1));


        // el string es inmutable: una vez que lo creas y le das un valor, no es posible hacerlo más grande ni más pequeño
        // hay quien prefiere en este caso utilizar StringBuilder

        System.out.println("¿Cadena vacía? " + otraPalabra.isEmpty());
        String str = "a simple string";
        str = str.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str);

        String s = "Hola a todos";
        //s = s.replace(" ", "");
        s = s.toUpperCase().replace("H","B");
        System.out.println(s);
        System.out.println(s.contains("Bola"));
    }
}
