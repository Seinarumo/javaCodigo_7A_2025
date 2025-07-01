import java.util.Scanner;

public class Docena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 36: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primera docena (1-12).");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena (13-24).");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercer docena (25-36).");
        } else {
            System.out.println("Número fuera de rango válido.");
        }

        scanner.close();
    }
}
