public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Telefono y Tablet
        Dispositivo d1 = new Telefono("Samsung", "Galaxy S22", true);
        Dispositivo d2 = new Tablet("Apple", "iPad Air", 10.9);
        // Mostrar especificaciones del teléfono y hacer uso de los metodos
        d1.mostrarEspecificaciones();
        ((Conectable) d1).conectar();
        ((Actualizable) d1).actualizarSistema();
        System.out.println();
        // Mostrar especificaciones de la tablet y hacer uso de los metodos
        d2.mostrarEspecificaciones();
        ((Conectable) d2).conectar();
        ((Actualizable) d2).actualizarSistema();
        ((Conectable) d2).desconectar();
    }
}