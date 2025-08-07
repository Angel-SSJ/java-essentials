public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    // Constructor completo
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        setPromedio(promedio); // Usar el setter para validación
    }

    // Constructor sin promedio
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = 0.0; // Promedio por default si no se proporciona
    }

    // Getters para validar promedio de 0 - 10
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters con validación promedio de 0 - 10
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0 y 10. Se asignará 0.0 por defecto.");
            this.promedio = 0.0;
        }
    }

    // Metodo aprobar () que incrementa promedio en 0.5 (hasta max 10)
    public void aprobar() {
        incrementarPromedio(0.5);
    }

    // Sobrecarga de aprobar() con parámetro de incremento
    public void aprobar(double incremento) {
        incrementarPromedio(incremento);
    }

    // Método auxiliar para incrementar promedio con validación
    private void incrementarPromedio(double incremento) {
        double nuevoPromedio = this.promedio + incremento;
        if (nuevoPromedio > 10.0) {
            this.promedio = 10.0;
        } else if (nuevoPromedio < 0.0) {
            this.promedio = 0.0;
        } else {
            this.promedio = nuevoPromedio;
        }
    }
}