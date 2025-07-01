import java.util.Scanner;

public class SueldoNetoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar categoría
        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        char categoria = scanner.nextLine().toUpperCase().charAt(0);

        // Ingresar antigüedad
        System.out.print("Ingrese la antigüedad en años: ");
        int antiguedad = scanner.nextInt();

        // Ingresar sueldo bruto
        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = scanner.nextDouble();

        double aumento = 0;
        int plus = 0;

        // Calcular aumento según antigüedad
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = sueldoBruto * 0.05;  // 5%
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = sueldoBruto * 0.10;  // 10%
        } else if (antiguedad > 10) {
            aumento = sueldoBruto * 0.30;  // 30%
        }

        // Calcular plus según categoría
        switch (categoria) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                scanner.close();
                return;
        }

        // Calcular sueldo neto
        double sueldoNeto = sueldoBruto + aumento + plus;

        System.out.println("Sueldo neto del empleado: $" + sueldoNeto);

        scanner.close();
    }
}
