import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la calificación del examen (0-100)
        System.out.print("Ingresa la calificación del examen (0-100): ");
        int calificacion = scanner.nextInt();

        // Determinar la letra correspondiente a la calificación
        char letraCalificacion;
        if (calificacion >= 90 && calificacion <= 100) {
            letraCalificacion = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letraCalificacion = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letraCalificacion = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letraCalificacion = 'D';
        } else if (calificacion >= 0 && calificacion < 60) {
            letraCalificacion = 'F';
        } else {
            System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
            return;
        }

        // Mostrar la letra de la calificación
        System.out.println("La calificación " + calificacion + " corresponde a: " + letraCalificacion);
    }
}
