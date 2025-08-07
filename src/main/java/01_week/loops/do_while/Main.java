public class Main {
    public static void main(String[] args) {
        // Ejemplo 1: Menú de opciones
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("¡Hola! Bienvenido/a");
                    break;
                case 2:
                    System.out.println("¡Hasta pronto!");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);

        scanner.close();

        // Ejemplo 2: Validación de entrada
        int numero;
        do {
            System.out.print("\nIngrese un número positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Error: Debe ingresar un número positivo");
            }
        } while (numero <= 0);

        System.out.println("Número válido ingresado: " + numero);
    }
}