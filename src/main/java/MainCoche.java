public class MainCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla");
        System.out.println("Coche creado: " + miCoche.getMarca() + " " + miCoche.getModelo());
        System.out.println("Velocidad inicial: " + miCoche.getVelocidad() + " km/h");        // Prueba de métodos

        miCoche.acelerar(30);
        miCoche.acelerar(20);
        miCoche.frenar(15);
        miCoche.frenar(40);
        // No puede quedar en negativo        // Mostrar velocidad final
        System.out.println("\nVelocidad final obtenida con getter: " + miCoche.getVelocidad() + " km/h");

        }
}