// Clase Gerente
class Gerente extends Empleado implements Bonificable{
    Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.20;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cargo: Gerente");
        System.out.println("Bonificacion: $" + calcularBonificacion());
    }
}