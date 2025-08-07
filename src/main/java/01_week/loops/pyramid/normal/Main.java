public class Main {
    public static void main(String[] args) {
        int filas = 5; // Altura de la pirámide

        for (int i = 1; i <= filas; i++) {
            // Espacios en blanco antes de los asteriscos
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Salto de línea
        }
    }
}
