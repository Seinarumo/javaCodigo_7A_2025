import java.util.Random;

public class NumerosAleatoriosMaxMin {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;

        int maximo = Integer.MIN_VALUE; // Inicializamos al mínimo valor posible
        int minimo = Integer.MAX_VALUE; // Inicializamos al máximo valor posible

        do {
            int num = random.nextInt(100); // Número aleatorio entre 0 y 99
            System.out.println("Número " + (contador + 1) + ": " + num);

            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo) {
                minimo = num;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Número máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);
    }
}
