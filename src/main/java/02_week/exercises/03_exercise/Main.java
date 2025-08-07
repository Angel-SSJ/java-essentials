public class Main{


    public static void main(String[] args) {
        // Primer Estudiante Angel Ramirez
        Estudiante est1 = new Estudiante("Angel Ramirez", 20, "Ingenieria de Software", 8.5);
        System.out.println("Estudiante 1: " + est1.getNombre() + ", Promedio inicial: " + est1.getPromedio());
        est1.aprobar();
        System.out.println("Estudiante 1: " + est1.getNombre() + ", Promedio después de aprobar(): " + est1.getPromedio());
        est1.aprobar(0.7);
        System.out.println("Estudiante 1: " + est1.getNombre() + ", Promedio después de aprobar(0.7): " +
                est1.getPromedio());
        est1.aprobar(2.0); // Incremento que supera 10
        System.out.println("Estudiante 1: " + est1.getNombre() + ", Promedio después de aprobar(2.0): " +
                est1.getPromedio());
        // Segundo Estudiante Leonardo Perez
        Estudiante est2 = new Estudiante("Leonardo Perez", 22, "Ingenieria Robotica"); // Constructor sin promedio
        System.out.println("Estudiante 2: " + est2.getNombre() + ", Promedio inicial: " + est2.getPromedio());
        est2.aprobar(1.5);
        System.out.println("Estudiante 2: " + est2.getNombre() + ", Promedio después de aprobar(1.5): " +
                est2.getPromedio());
        // Tercer Estudiante Irvin Canjura
        Estudiante est3 = new Estudiante("Irvin Canjura", 19, "Medicina", 12.0); // Promedio inicial inválido
        System.out.println("Estudiante 3: " + est3.getNombre() + ", Promedio inicial: " + est3.getPromedio());
    }
}