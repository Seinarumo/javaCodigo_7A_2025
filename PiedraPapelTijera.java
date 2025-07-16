import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de las elecciones
        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");

        System.out.print("Jugador 1, ingrese su elección: ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su elección: ");
        int jugador2 = scanner.nextInt();

        // Verificar si los valores ingresados son válidos
        if (jugador1 < 0 || jugador1 > 2 || jugador2 < 0 || jugador2 > 2) {
            System.out.println("Entrada no válida. Solo se permite 0, 1 o 2.");
        } else if (jugador1 == jugador2) {
            System.out.println("Empate.");
        } else if ((jugador1 == 0 && jugador2 == 2) || 
                   (jugador1 == 1 && jugador2 == 0) || 
                   (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("¡Gana el Jugador 1!");
        } else {
            System.out.println("¡Gana el Jugador 2!");
        }

        scanner.close();
    }
}
