// Clase base abstracta para representar un método de pago genérico
abstract class MetodoPago {
    protected String titular; // Nombre del titular del método de pago
    protected double monto; // Monto a pagar o reembolsar
    // Constructor común para todos los métodos de pago
    public MetodoPago(String titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }
    // Método abstracto que debe implementarse para procesar un pago
    public abstract void procesarPago();
}