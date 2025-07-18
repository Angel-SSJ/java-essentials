public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 432);
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        // Mostrar información inicial
        libro1.mostrarInfo();
        libro2.mostrarInfo();

        // Probar métodos de préstamo
        libro1.prestar();
        libro1.prestar();

        // Intentar prestar dos veces
        libro2.prestar();

        // Mostrar estado actual
        libro1.mostrarInfo();
        libro2.mostrarInfo();

        // Devolver libros
        libro1.devolver();
        libro2.devolver();

        // Modificar atributos
        libro1.setTitulo("Cien años de soledad (Edición especial)");
        libro2.setAutor("Eric Arthur Blair (George Orwell)");

        // Mostrar información final
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}