// Clase Vendedor
class Vendedor extends Empleado implements Bonificable{
    Vendedor(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.10;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cargo: Vendedor");
        System.out.println("Bonificacion: $" + calcularBonificacion());
    }
}