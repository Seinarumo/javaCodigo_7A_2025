import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del mes
        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para comparar

        int dias;

        // Determinar la cantidad de días usando if-else
        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            dias = 30;
        } else if (mes.equals("febrero")) {
            dias = 28; // Asumimos año no bisiesto
        } else {
            dias = 31;
        }

        // Mostrar el resultado
        System.out.println("El mes de " + mes + " tiene " + dias + " días.");

        scanner.close();
    }
}
