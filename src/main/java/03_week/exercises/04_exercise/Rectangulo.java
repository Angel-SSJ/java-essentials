// Clase concreta que representa un rectángulo
class Rectangulo extends Figura implements Redimensionable {
    private double ancho; // Ancho del rectángulo
    private double alto; // Alto del rectángulo
    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    // Implementación del método para calcular el área
    @Override
    public double area() {
        return ancho * alto;
    }
    // Implementación del método para calcular el perímetro
    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }
    // Implementación del método escalar
    @Override
    public void escalar(double factor) {
        ancho *= factor;
        alto *= factor;
    }
    // Representación en texto de los datos del rectángulo
    @Override
    public String toString() {
        return String.format("Rectángulo - Ancho: %.2f, Alto: %.2f, Área: %.2f, Perímetro: %.2f", ancho, alto, area(),
                perimetro());
    }
}