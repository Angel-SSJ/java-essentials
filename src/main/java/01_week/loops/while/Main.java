public class Main {
    public static void main(String[] args) {
        // Ejemplo 1: Contador ascendente
        System.out.println("Contador ascendente:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;
        }

        // Ejemplo 2: Suma de números hasta que se ingrese 0
        System.out.println("\nSuma de números (ingrese 0 para terminar):");
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}