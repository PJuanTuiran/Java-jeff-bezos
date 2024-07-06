import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su peso en kilogramos
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Pedir al usuario que ingrese su altura en metros
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado del IMC
        System.out.println("Tu índice de masa corporal (IMC) es: " + imc);
    }
}
