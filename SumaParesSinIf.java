import java.util.Scanner;

public class SumaParesSinIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        int sumaPares = 0;

        // Solo iterar con i pares
        for (int i = 2; i <= 10; i += 2) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            sumaPares += resultado;
        }

        System.out.println("La suma de los valores pares (considerando i pares) es: " + sumaPares);

        scanner.close();
    }
}
