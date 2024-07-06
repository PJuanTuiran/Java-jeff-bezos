import java.util.Scanner;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija la dirección de la conversión
        System.out.println("¿Qué conversión de temperatura deseas realizar?");
        System.out.println("1. De Celsius a Fahrenheit");
        System.out.println("2. De Fahrenheit a Celsius");
        System.out.print("Selecciona una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        // Declarar variables
        double temperatura;
        double resultado;

        // Realizar la conversión según la opción seleccionada
        switch (opcion) {
            case 1: // De Celsius a Fahrenheit
                System.out.print("Ingresa la temperatura en grados Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura * 9/5) + 32;
                System.out.println("La temperatura en grados Fahrenheit es: " + resultado);
                break;
            case 2: // De Fahrenheit a Celsius
                System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura - 32) * 5/9;
                System.out.println("La temperatura en grados Celsius es: " + resultado);
                break;
            default:
                System.out.println("Opción inválida. Por favor, selecciona 1 o 2.");
                break;
        }
    }
}
