public class Main {
    public static void main(String[] args) {
        int filas = 5;

        for (int i = filas; i >= 1; i--) {
            // Espacios en blanco
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Caracteres #
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}