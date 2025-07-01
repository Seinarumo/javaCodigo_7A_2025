import java.util.Scanner;

public class DiasDelMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase();

        int dias;

        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28;
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            default:
                dias = -1; // Valor para indicar mes inválido
                break;
        }

        if (dias == -1) {
            System.out.println("Mes no válido.");
        } else {
            System.out.println("El mes de " + mes + " tiene " + dias + " días.");
        }

        scanner.close();
    }
}
