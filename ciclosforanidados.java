public class TodasLasTablas {
    public static void main(String[] args) {
        // Ciclo para cada número del 1 al 10 (la tabla que queremos mostrar)
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabla del " + numero + ":");
            
            // Ciclo para multiplicar por 1 hasta 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            
            System.out.println();  // Línea en blanco para separar tablas
        }
    }
}
