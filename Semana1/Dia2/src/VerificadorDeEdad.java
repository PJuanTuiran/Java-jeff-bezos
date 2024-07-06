import java.util.Scanner;

public class VerificadorDeEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Verificar si el usuario es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }
}
