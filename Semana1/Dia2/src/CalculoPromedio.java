import java.util.Scanner;

public class CalculoPromedio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las tres calificaciones
        System.out.print("Introduce la primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        System.out.print("Introduce la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        System.out.print("Introduce la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Mostrar el promedio
        System.out.println("El promedio es: " + promedio);

        // Determinar si el alumno aprueba o no
        if (promedio >= 6) {
            System.out.println("El alumno aprueba.");
        } else {
            System.out.println("El alumno no aprueba.");
        }
    }
}
