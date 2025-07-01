import java.util.Random;

public class SueldoNetoEmpleadoRandom {
    public static void main(String[] args) {
        Random random = new Random();

        String categoriasValidas = "ABC";

        int contador = 0;
        while (contador < 10) {
            char categoria;
            int antiguedad;
            double sueldoBruto;

            // Obtener categoría válida con ciclo while
            while (true) {
                // Elegir una categoría al azar entre A, B o C
                int index = (int) (Math.random() * categoriasValidas.length());
                categoria = categoriasValidas.charAt(index);

                // Verificar que sea válida (en este caso siempre lo será, pero dejamos la lógica)
                if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
                    break; // categoría válida, salimos del while
                }
            }

            // Obtener antigüedad válida (entre 0 y 20 años)
            while (true) {
                antiguedad = random.nextInt(21); // 0 a 20 inclusive
                if (antiguedad >= 0) {
                    break;
                }
            }

            // Obtener sueldo bruto válido (entre 10000 y 50000)
            while (true) {
                sueldoBruto = 10000 + (Math.random() * (50000 - 10000));
                if (sueldoBruto >= 10000 && sueldoBruto <= 50000) {
                    break;
                }
            }

            // Calcular aumento según antigüedad
            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5) {
                aumento = sueldoBruto * 0.05;  // 5%
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                aumento = sueldoBruto * 0.10;  // 10%
            } else if (antiguedad > 10) {
                aumento = sueldoBruto * 0.30;  // 30%
            }

            // Calcular plus según categoría
            int plus = 0;
            switch (categoria) {
                case 'A': plus = 1000; break;
                case 'B': plus = 2000; break;
                case 'C': plus = 3000; break;
            }

            // Calcular sueldo neto
            double sueldoNeto = sueldoBruto + aumento + plus;

            // Mostrar resultado
            System.out.printf("Empleado %d: Categoría %c, Antigüedad %d años, Sueldo bruto $%.2f, Sueldo neto $%.2f%n",
                    contador + 1, categoria, antiguedad, sueldoBruto, sueldoNeto);

            contador++;
        }
    }
}
