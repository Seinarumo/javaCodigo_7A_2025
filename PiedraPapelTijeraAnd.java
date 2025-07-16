import java.util.Scanner;

public class PiedraPapelTijeraAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");

        System.out.print("Jugador 1, ingrese su elección: ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su elección: ");
        int jugador2 = scanner.nextInt();

        // Validar entradas válidas
        if ((jugador1 < 0 || jugador1 > 2) || (jugador2 < 0 || jugador2 > 2)) {
            System.out.println("Entrada no válida. Solo se permite 0, 1 o 2.");
        } 
        // Empate
        else if (jugador1 == jugador2) {
            System.out.println("Empate.");
        } 
        // Condiciones para que gane Jugador 1 usando AND (&&)
        else if ((jugador1 == 0 && jugador2 == 2) ||  // Piedra gana a tijera
                 (jugador1 == 1 && jugador2 == 0) ||  // Papel gana a piedra
                 (jugador1 == 2 && jugador2 == 1)) {  // Tijera gana a papel
            System.out.println("¡Gana el Jugador 1!");
        } 
        // Si no es ninguna de las anteriores, gana Jugador 2
        else {
            System.out.println("¡Gana el Jugador 2!");
        }

        scanner.close();
    }
}
