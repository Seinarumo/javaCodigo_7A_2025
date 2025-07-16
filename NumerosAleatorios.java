import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            int num = random.nextInt(100); // Número aleatorio entre 0 y 99
            System.out.println("Número " + (contador + 1) + ": " + num);
            suma += num;
            contador++;
        }

        double promedio = suma / 10.
