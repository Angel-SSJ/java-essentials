public class Main {
    public static void main(String[] args) {
        int filas = 4;

        for (int i = 1; i <= filas; i++) {
            // Espacios en blanco
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Números ascendentes
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}

