// MAIN ingreso de datos
public class Main {
    public static void main(String[] args) {
        // Creando la instancia de Electrodomestico
        Electrodomestico lavadora = new Electrodomestico(12345678, 800.0, "Samsung", "SAMSFX12345");
        System.out.println("--- Datos de Inventario vendido de Electrodoméstico ---");
        lavadora.mostrarDetalles();
        double descuentoElectro = lavadora.aplicarDescuento(20.0);
        System.out.println("Precio con 20% de descuento: $" + descuentoElectro);
        int garantiaElectro = lavadora.obtenerMesesGarantia();
        System.out.println("Meses de garantía: " + garantiaElectro);
        System.out.println();
        // Creando la instancia Alimento
        Alimento pan = new Alimento(87654321, 10.5, "15-08-2025");
        System.out.println("--- Datos de Inventario vendido de Alimento ---");
        pan.mostrarDetalles();
        double descuentoAlimento = pan.aplicarDescuento(10.0);
        System.out.println("Precio con 10% de descuento: $" + descuentoAlimento);
        // Nota: Alimento no tiene garantia por ser de consumo inmediato
    }
}