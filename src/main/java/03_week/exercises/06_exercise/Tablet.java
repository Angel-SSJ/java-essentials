public class Tablet extends Dispositivo implements Conectable, Actualizable {
    // Tamaño específico de la tablet
    private double tamanioPantalla;
    // Constructor
    public Tablet(String marca, String modelo, double tamanioPantalla) {
        super(marca, modelo);
        this.tamanioPantalla = tamanioPantalla;
    }
    // Implementación del metodo conectar
    @Override
    public void conectar() {
        System.out.println("Tablet conectada a WiFi.");
    }
    // Implementación del metodo desconectar
    @Override
    public void desconectar() {
        System.out.println("Tablet desconectada de WiFi.");
    }
    // Implementación del metodo actualizarSistema
    @Override
    public void actualizarSistema() {
        System.out.println("Tablet actualizando sistema...");
    }
    // Mostrar especificaciones de la tablet
    @Override
    public void mostrarEspecificaciones() {
        System.out.println("Tablet - Marca: " + marca + ", Modelo: " + modelo + ", Pantalla: " + tamanioPantalla + "
                pulgadas");
    }
}