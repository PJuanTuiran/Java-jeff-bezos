import java.util.Scanner;

public class ConversorDeUnidades {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la distancia en kilómetros
        System.out.print("Introduce la distancia en kilómetros: ");
        double kilometros = scanner.nextDouble();

        // Convertir kilómetros a millas
        double millas = kilometros / 1.60934;

        // Mostrar la distancia en millas
        System.out.println(kilometros + " kilómetros son " + millas + " millas.");
    }
}
