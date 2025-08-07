
//Main, punto de ingreso de la informacion, se crea un objeto estudiante y profesor
public class Main {
    public static void main(String[] args) {
        // Create an instance of Estudiante
        Estudiante estudiante = new Estudiante(20250101, "Diego Canjura", "diego.canjura@gmail.com", "Ingeniería de
                desarrollo de Software y ciencia de datos");
                System.out.println("--- Información del Estudiante ---");
        estudiante.mostrarInformacion();
        estudiante.login();
        estudiante.logout();
        System.out.println();
        // Create an instance of Profesor
        Profesor profesor = new Profesor(202502, "Christian Garcia", "chrisitan.garcia@gmail.com", "Facultad de
                Ingenieria");
                System.out.println("--- Información del Profesor ---");
        profesor.mostrarInformacion();
        profesor.login();
        profesor.logout();
    }
}
