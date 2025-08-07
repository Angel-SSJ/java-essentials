public abstract class Dispositivo {
    //Atributos
    protected String marca;
    protected String modelo;
    //Constructor
    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    // Metodo abstracto para mostrar características propias del dispositivo
    public abstract void mostrarEspecificaciones();
}