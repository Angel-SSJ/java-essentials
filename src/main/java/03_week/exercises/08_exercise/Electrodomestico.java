//Clase (hija) electrodomestico
public class Electrodomestico extends Producto implements Descuento, Garantia {
    private String marca;
    private String modelo;
    public Electrodomestico(int id, double precio, String marca, String modelo) {
        super(id, precio);
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Informacion del Electrodoméstico ---");
        System.out.println("ID: " + getId());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
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
    @Override
    public int obtenerMesesGarantia() {
        return 6; // 6 meses de garantia
    }
}