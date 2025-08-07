// Clase alimento (hija)
public class Alimento extends Producto implements Descuento {
    private String fechaCaducidad;
    public Alimento(int id, double precio, String fechaCaducidad) {
        super(id, precio);
        this.fechaCaducidad = fechaCaducidad;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Informacion del Alimento (pan de dulce) ---");
        System.out.println("ID: " + getId());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Fecha de Caducidad: " + this.fechaCaducidad);
    }
    @Override
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje de descuento no válido.");
            return getPrecio(); // Regresa a precio original
        }
        double descuento = getPrecio() * (porcentaje / 100);
        return getPrecio() - descuento;
    }
}