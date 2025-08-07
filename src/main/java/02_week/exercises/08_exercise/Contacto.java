// Importo las clases Matcher y Pattern para manipular texto
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Atributos
public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    // Constructor con nombre y telefono (sin email)
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = null; // Email opcional
    }
    // Constructor con nombre, telefono y email
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        setEmail(email); // Usar setter para validación
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // Setter con validación de formato de email
    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            this.email = null;
        } else if (validarEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Formato de email inválido: " + email + ". El email no será asignado.");
            this.email = null; // No asignar si el formato es inválido
        }
    }
    // Método privado para validar el formato del email
    private boolean validarEmail(String email) {
        // Expresión regular básica para validar email
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    // Método mostrarContacto() en formato completo
    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        if (email != null) {
            System.out.println("Email: " + email);
        } else {
            System.out.println("Email: No especificado");
        }
    }
    // Sobrecarga de mostrarContacto() para formato compacto
    public void mostrarContacto(boolean formatoCompacto) {
        if (formatoCompacto) {
            System.out.print(nombre + " (" + telefono + ")");
            if (email != null) {
                System.out.println(" - " + email);
            } else {
                System.out.println(); // Salto de línea si no hay email
            }
        } else {
            mostrarContacto(); // Llama al método de formato completo
        }
    }
    // Método equals() para comparar por teléfono
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contacto otroContacto = (Contacto) obj;
        // Comparar por número de teléfono
        return this.telefono.equals(otroContacto.telefono);
    }
    // Sobrescribir hashCode() es una buena práctica cuando se sobrescribe equals()
    @Override
    public int hashCode() {
        return telefono.hashCode();
    }
    public static void main(String[] args) {
        // Ejemplo de uso
        Contacto c1 = new Contacto("Diego Canjura", "503-77777777"); // Sin email
        Contacto c2 = new Contacto("Irvin Arguera", "503-88888888", "irving.arguera@gmail.com"); // Con email
        Contacto c3 = new Contacto("Irvin Arguera", "503-88888888", "irving.g@invalid"); // Email inválido
        Contacto c4 = new Contacto("Angel Ceron", "503-77777777"); // Mismo teléfono que c1
        System.out.println("Contacto 1 (Formato Completo):");
        c1.mostrarContacto();
        System.out.println("\nContacto 2 (Formato Compacto):");
        c2.mostrarContacto(true);
        System.out.println("\nContacto 3 (Email Inválido):");
        c3.mostrarContacto();
        System.out.println("\nComparaciones con equals():");
        System.out.println("¿c1 es igual a c2? " + c1.equals(c2)); // Debería ser false
        System.out.println("¿c1 es igual a c4? " + c1.equals(c4)); // Debería ser true
        System.out.println("¿c2 es igual a c3? " + c2.equals(c3)); // Debería ser false
    }
}