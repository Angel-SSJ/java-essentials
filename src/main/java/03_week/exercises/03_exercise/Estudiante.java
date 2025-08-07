//Estudiante (hija) hereda de clase Usuario (padre) implementa interfaz
// y un atributo de carrera, con u constructor de los atributos heredados.
public class Estudiante extends Usuario implements Autenticable {
    private String carrera;
    public Estudiante(int id, String nombre, String email, String carrera) {
        super(id, nombre, email);
        this.carrera = carrera;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Carrera: " + this.carrera);
    }
    @Override
    public void login() {
        System.out.println("Estudiante " + getNombre() + " logged in.");
    }
    @Override
    public void logout() {
        System.out.println("Estudiante " + getNombre() + " logged out.");
    }
}