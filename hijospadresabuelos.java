import java.util.Scanner;

public class CategoriaFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la categoría
        System.out.print("Ingrese una categoría (a, b o c): ");
        String categoria = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para evitar errores

        // Evaluar la categoría e imprimir el resultado
        if (categoria.equals("a")) {
            System.out.println("hijo");
        } else if (categoria.equals("b")) {
            System.out.println("padres");
        } else if (categoria.equals("c")) {
            System.out.println("abuelos");
        } else {
            System.out.println("Categoría no válida.");
        }

        scanner.close();
    }
}
