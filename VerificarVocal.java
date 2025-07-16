import java.util.Scanner;

public class VerificarVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un carácter al usuario
        System.out.print("Ingrese un carácter: ");
        char letra = scanner.next().toLowerCase().charAt(0);  // Convertir a minúscula para facilitar la comparación

        // Verificar si es vocal usando OR lógico
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("El carácter es una vocal.");
        } else {
            System.out.println("El carácter NO es una vocal.");
        }

        scanner.close();
    }
}
