public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    //Constructor padre
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public void mostrarInfo() {
        //Imprimir en consola
        System.out.println("Vehículo:");
        System.out.println(" Marca: " + marca);
        System.out.println(" Modelo: " + modelo);
        System.out.println(" Año: " + anio);
    }
}