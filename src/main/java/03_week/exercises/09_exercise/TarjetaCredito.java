
// Clase que representa un pago con tarjeta de crédito
// Hereda de MetodoPago e implementa las interfaces Seguro y Reembolsable
class TarjetaCredito extends MetodoPago implements Seguro, Reembolsable {
    private String numeroTarjeta; // Número de la tarjeta
    private String cvv; // Código de seguridad
    // Constructor
    public TarjetaCredito(String titular, double monto, String numeroTarjeta, String cvv) {
        super(titular, monto);
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
    }
    // Implementación del método de seguridad
    @Override
    public void verificarSeguridad() {
        System.out.println("Verificando chip y código CVV de la tarjeta...");
    }
    // Implementación del reembolso
    @Override
    public void realizarReembolso() {
        System.out.printf("Reembolso de $%.2f a la tarjeta de %s\n", monto, titular);
    }
    // Implementación del procesamiento del pago
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con Tarjeta de Crédito:");
        verificarSeguridad(); // Llamada al método de seguridad
        System.out.printf("Cobrando $%.2f a %s usando la tarjeta %s\n", monto, titular, numeroTarjeta);
    }
}