public class Main {
    public static void main(String[] args) {
        // Crear objetos Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);

        // Usar métodos
        persona1.saludar();
        persona2.saludar();

        // Modificar con setters
        persona1.setNombre("Juan Carlos");
        persona1.setEdad(26);
        persona2.setEdad(31);

        // Mostrar cambios
        System.out.println("\nDespués de modificar:");
        persona1.saludar();
        persona2.saludar();

        // Usar getters
        System.out.println("\nInformación obtenida con getters:");
        System.out.println(persona1.getNombre() + " - " + persona1.getEdad() + " años");
        System.out.println(persona2.getNombre() + " - " + persona2.getEdad() + " años");
    }
}