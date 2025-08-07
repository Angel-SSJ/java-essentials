import java.util.Scanner;
public class Coche {
    // Atributos privados
    private String marca;
    private String modelo;
    private int anio;
    private double velocidad;
    // Constructor
    public Coche(String marca, String modelo, int anio, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = velocidad;
    }
    // Getters y Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    // Métodos de funcionalidad
    public void acelerar() {
        velocidad += 10;
        System.out.println("Acelerando 10 km/h...");
    }
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidad += incremento;
            System.out.println("Acelerando " + incremento + " km/h...");
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
    public void frenar() {
        velocidad = Math.max(0, velocidad - 10);
        System.out.println("Frenando 10 km/h...");
    }
    public void mostrarVelocidad() {
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }
    public void mostrarVelocidad(boolean enMillas) {
        if (enMillas) {
            double mph = velocidad * 0.621371;
            System.out.printf("Velocidad actual: %.2f mph%n", mph);
        } else {
            mostrarVelocidad();
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Entrada de datos del usuario
            System.out.print("Marca del coche: ");
            String marca = sc.nextLine();
            System.out.print("Modelo del coche: ");
            String modelo = sc.nextLine();
            System.out.print("Año del coche: ");
            int anio = sc.nextInt();
            System.out.print("Velocidad inicial (km/h): ");
            double velocidad = sc.nextDouble();
            // Crear el objeto Coche
            Coche miCoche = new Coche(marca, modelo, anio, velocidad);
            int opcion;
            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Acelerar 10 km/h");
                System.out.println("2. Acelerar con cantidad personalizada");
                System.out.println("3. Frenar 10 km/h");
                System.out.println("4. Mostrar velocidad (km/h)");
                System.out.println("5. Mostrar velocidad (mph)");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        miCoche.acelerar();
                        break;
                    case 2:
                        System.out.print("¿Cuántos km/h desea acelerar? ");
                        double incremento = sc.nextDouble();
                        miCoche.acelerar(incremento);
                        break;
                    case 3:
                        miCoche.frenar();
                        break;
                    case 4:
                        miCoche.mostrarVelocidad();
                        break;
                    case 5:
                        miCoche.mostrarVelocidad(true);
                        break;
                    case 6:
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } while (opcion != 6);
            sc.close();
        }
    }
}