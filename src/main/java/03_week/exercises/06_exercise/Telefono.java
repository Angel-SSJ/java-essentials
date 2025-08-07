public class Telefono extends Dispositivo implements Conectable, Actualizable {
    // Atributo específico del teléfono
    private boolean tiene5G;
    // Constructor
    public Telefono(String marca, String modelo, boolean tiene5G) {
        super(marca, modelo);
        this.tiene5G = tiene5G;
    }
    // Implementación del metodo conectar
    @Override
    public void conectar() {
        System.out.println("Teléfono conectado a la red móvil.");
    }
    // Implementación del metodo desconectar
    @Override
    public void desconectar() {
        System.out.println("Teléfono desconectado de la red.");
    }
    // Implementación del metodo actualizarSistema
    @Override
    public void actualizarSistema() {
        System.out.println("Teléfono actualizando sistema operativo...");
    }
    // Mostrar especificaciones del teléfono
    @Override
    public void mostrarEspecificaciones() {
        System.out.println("Teléfono - Marca: " + marca + ", Modelo: " + modelo + ", Soporta 5G: " + (tiene5G ? "Sí" : "No"));
    }
}