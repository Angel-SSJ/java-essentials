public class Main{
    public static void main(String[] args) {
        //Utilizacion de clases y metodos
        Empleado empleado = new Gerente("Oscar", 700);
        Empleado empleado2 = new Vendedor("Juan", 400);
        System.out.println("Datos del gerente");
        empleado.mostrarDatos();
        System.out.println();
        System.out.println("Datos del vendedor");
        empleado2.mostrarDatos();
    }
}
