// Clase que representa un pago usando PayPal
// Hereda de MetodoPago e implementa Reembolsable (pero no Seguro)
class PayPal extends MetodoPago implements Reembolsable {
    private String correoElectronico; // Cuenta de correo asociada a PayPal
    // Constructor
    public PayPal(String titular, double monto, String correoElectronico) {
        super(titular, monto);
        this.correoElectronico = correoElectronico;
    }
    // Implementación del reembolso
    @Override
    public void realizarReembolso() {
        System.out.printf("Reembolso de $%.2f a la cuenta PayPal de %s\n", monto, correoElectronico);
    }
    // Implementación del procesamiento del pago
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con PayPal:");
        System.out.printf("Autenticando cuenta de %s...\n", correoElectronico);
        System.out.printf("Cobrando $%.2f a %s vía PayPal\n", monto, titular);
    }
}