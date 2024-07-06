import java.util.Scanner;

public class CalculadoraTarifaTaxi {
    public static void main(String[] args) {
        // Definir las tarifas
        final double TARIFA_BASE = 5.00; // Tarifa base en pesos colombianos
        final double TARIFA_POR_KILOMETRO = 2.50; // Tarifa adicional por kilómetro en pesos colombianos

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la distancia del viaje en kilómetros
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Calcular el costo del viaje
        double costoViaje = TARIFA_BASE + (distancia * TARIFA_POR_KILOMETRO);

        // Mostrar el costo del viaje
        System.out.println("El costo del viaje es: $" + costoViaje);
    }
}
