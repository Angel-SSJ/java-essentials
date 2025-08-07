// Definición de la clase 'Persona'
public class Persona {
    // Atributo privado (solo accesible dentro de la clase)
    private String nombre;

    // Método de instancia (setter): asigna un valor al atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;  // 'this' se refiere al objeto actual
    }

    // Método de instancia: imprime un saludo usando el atributo 'nombre'
    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre);
    }
}
