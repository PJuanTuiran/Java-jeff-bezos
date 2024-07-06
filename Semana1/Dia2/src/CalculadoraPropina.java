import java.util.Scanner;

public class CalculadoraPropina {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el total de la cuenta
        System.out.print("Introduce el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();

        // Pedir al usuario que ingrese el porcentaje de propina que desea dejar
        System.out.print("Introduce el porcentaje de propina que deseas dejar: ");
        double porcentajePropina = scanner.nextDouble();

        // Calcular el monto de la propina
        double montoPropina = totalCuenta * (porcentajePropina / 100);

        // Mostrar el monto de la propina
        System.out.println("Debes dejar " + montoPropina + " en propina.");
    }
}
