import java.util.Scanner;

public class CalculadoraDiasMes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de un mes (1-12)
        System.out.print("Introduce el número de un mes (1-12): ");
        int mes = scanner.nextInt();

        // Determinar el número de días del mes usando una estructura switch
        int dias;
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                dias = 28;
                break;
            default:
                System.out.println("Mes inválido. Por favor, introduce un número entre 1 y 12.");
                return;
        }

        // Mostrar el número de días del mes
        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }
}
