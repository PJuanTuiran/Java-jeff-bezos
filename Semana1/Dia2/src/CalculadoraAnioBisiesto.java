import java.util.Scanner;

public class CalculadoraAnioBisiesto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un año
        System.out.print("Introduce un año: ");
        int anio = scanner.nextInt();

        // Determinar si el año es bisiesto o no
        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 != 0 || anio % 400 == 0) {
                esBisiesto = true;
            }
        }

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}
