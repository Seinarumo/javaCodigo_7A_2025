import java.util.Scanner;

public class PuestoTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el puesto del participante
        System.out.print("Ingrese el puesto que ocupó en el torneo (número entero): ");
        int puesto = scanner.nextInt();

        // Evaluar el puesto e imprimir el resultado
        if (puesto == 1) {
            System.out.println("El primero obtiene la medalla de oro.");
        } else if (puesto == 2) {
            System.out.println("El segundo obtiene la medalla de plata.");
        } else if (puesto == 3) {
            System.out.println("El tercero obtiene la medalla de bronce.");
        } else {
            System.out.println("Siga participando.");
        }

        scanner.close();
    }
}
