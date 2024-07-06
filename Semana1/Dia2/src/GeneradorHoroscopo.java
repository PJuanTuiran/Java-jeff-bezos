import java.util.Scanner;

public class GeneradorHoroscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el mes y día de nacimiento
        System.out.print("Ingresa el número de tu mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingresa el día de tu nacimiento (1-31): ");
        int dia = scanner.nextInt();

        // Determinar el signo del zodíaco basado en el mes y día de nacimiento
        String signo = "";
        switch (mes) {
            case 1: // Enero
                if (dia >= 1 && dia <= 19) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;
            case 2: // Febrero
                if (dia >= 1 && dia <= 18) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
                break;
            case 3: // Marzo
                if (dia >= 1 && dia <= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
                break;
            case 4: // Abril
                if (dia >= 1 && dia <= 19) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
                break;
            case 5: // Mayo
                if (dia >= 1 && dia <= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Géminis";
                }
                break;
            case 6: // Junio
                if (dia >= 1 && dia <= 20) {
                    signo = "Géminis";
                } else {
                    signo = "Cáncer";
                }
                break;
            case 7: // Julio
                if (dia >= 1 && dia <= 22) {
                    signo = "Cáncer";
                } else {
                    signo = "Leo";
                }
                break;
            case 8: // Agosto
                if (dia >= 1 && dia <= 22) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
                break;
            case 9: // Septiembre
                if (dia >= 1 && dia <= 22) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
                break;
            case 10: // Octubre
                if (dia >= 1 && dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 11: // Noviembre
                if (dia >= 1 && dia <= 21) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
                break;
            case 12: // Diciembre
                if (dia >= 1 && dia <= 21) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
                break;
            default:
                System.out.println("Mes inválido. Por favor, ingresa un número entre 1 y 12.");
                return;
        }

        // Mostrar el signo del zodíaco
        System.out.println("Tu signo del zodíaco es: " + signo);
    }
}
