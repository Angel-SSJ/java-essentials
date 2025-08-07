// Clase principal que ejecuta el sistema de pagos
public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de tipo MetodoPago: uno con tarjeta, otro con PayPal
        MetodoPago tarjeta = new TarjetaCredito("Juan Pérez", 150.75, "1234-5678-9012-3456", "123");
        MetodoPago paypal = new PayPal("Ana Gómez", 89.50, "ana.gomez@email.com");
        // Arreglo de pagos a procesar
        MetodoPago[] pagos = {tarjeta, paypal};
        // Recorrer los métodos de pago y procesarlos
        for (MetodoPago pago : pagos) {
            System.out.println("-----------------------------");
            pago.procesarPago(); // Llama al método correspondiente según el tipo
            // Si el pago es reembolsable, realizar reembolso
            if (pago instanceof Reembolsable) {
                ((Reembolsable) pago).realizarReembolso();
            }
        }
    }
}