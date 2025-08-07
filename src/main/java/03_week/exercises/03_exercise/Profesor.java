//Profesor (hijo) hereda de clase Usuario (padre) implementa interfaz
// y un atributo de departamento al que pertenece, con un constructor de los atributos heredados.
public class Profesor extends Usuario implements Autenticable {
    private String departamento;
    public Profesor(int id, String nombre, String email, String departamento) {
        super(id, nombre, email);
        this.departamento = departamento;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Departamento: " + this.departamento);
    }
    @Override
    public void login() {
        System.out.println("Profesor " + getNombre() + " logged in.");
    }
    @Override
    public void logout() {
        System.out.println("Profesor " + getNombre() + " logged out.");
    }
}