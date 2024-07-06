import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Mostrar el menú
            System.out.println("Menú de operaciones matemáticas:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");

            int opcion = scanner.nextInt();

            double numero1, numero2, resultado;

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
            }
            System.out.println();
        }
        System.out.println("¡Gracias por usar la calculadora!");
    }
}
