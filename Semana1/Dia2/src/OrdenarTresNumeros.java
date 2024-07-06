import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese tres números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número entero: ");
        int num3 = scanner.nextInt();

        // Ordenar los números de menor a mayor usando if-else
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Los números ordenados son: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Los números ordenados son: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Los números ordenados son: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Los números ordenados son: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Los números ordenados son: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}
