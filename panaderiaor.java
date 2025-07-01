import java.util.Scanner;

public class DocenaOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Detectar fuera de rango con OR
        if (numero < 1 || numero > 36) {
            System.out.println("El número " + numero + " está fuera de rango.");
        } else if (numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primera docena (1-12).");
        } else if (numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena (13-24).");
        } else {  // número entre 25 y 36
            System.out.println("El número " + numero + " pertenece a la tercer docena (25-36).");
        }

        scanner.close();
    }
}
