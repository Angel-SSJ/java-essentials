public abstract class Producto {
    private int id;
    private double precio;
    public Producto(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public double getPrecio() {
        return precio;
    }
    public abstract void mostrarDetalles();
}