



import java.util.Scanner;
public class CalculadoraFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario
        Figura figura = null; // Variable para almacenar la figura actual
        // Bucle principal del programa
        while (true) {
            // Menú de opciones
            System.out.println("\n--- Calculadora de Figuras ---");
            System.out.println("1. Crear Círculo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Escalar figura");
            System.out.println("4. Mostrar área y perímetro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt(); // Leer opción seleccionada
            // Ejecutar acción según la opción elegida
            switch (opcion) {
                case 1:
                    // Crear un nuevo círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    figura = new Circulo(radio);
                    break;
                case 2:
                    // Crear un nuevo rectángulo
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    figura = new Rectangulo(ancho, alto);
                    break;
                case 3:
                    // Escalar la figura si es redimensionable
                    if (figura instanceof Redimensionable) {
                        System.out.print("Ingrese el factor de escala: ");
                        double factor = scanner.nextDouble();
                        ((Redimensionable) figura).escalar(factor); // Llamar al método escalar
                        System.out.println("Figura escalada.");
                    } else {
                        System.out.println("Primero debe crear una figura.");
                    }
                    break;
                case 4:
                    // Mostrar área y perímetro de la figura
                    if (figura != null) {
                        System.out.println(figura.toString()); // Mostrar información
                    } else {
                        System.out.println("Primero debe crear una figura.");
                    }
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    // Opción inválida
                    System.out.println("Opción inválida.");
            }
        }
    }
}