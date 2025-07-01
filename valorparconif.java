import java.util.Scanner;

public class SumaParesConIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        int sumaPares = 0;

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

            // Verificar si el resultado es par
            if (resultado % 2 == 0) {
                sumaPares += resultado;
            }
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);

        scanner.close();
    }
}
