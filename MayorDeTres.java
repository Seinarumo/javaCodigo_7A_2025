import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de las tres variables enteras
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Determinar el mayor
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        // Mostrar el mayor
        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
