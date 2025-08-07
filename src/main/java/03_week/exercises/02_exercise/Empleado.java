class Empleado {
    String nombre;
    double salarioBase;
    Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    // Metodo mostrar datos
    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: $" + salarioBase);
    }
}