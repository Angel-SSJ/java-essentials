// Clase concreta que representa un círculo
class Circulo extends Figura implements Redimensionable {
    private double radio; // Radio del círculo
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    // Implementación del método para calcular el área
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    // Implementación del método para calcular el perímetro
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    // Implementación del método escalar
    @Override
    public void escalar(double factor) {
        radio *= factor; // Aumenta o reduce el radio
    }
    // Representación en texto de los datos del círculo
    @Override
    public String toString() {
        return String.format("Círculo - Radio: %.2f, Área: %.2f, Perímetro: %.2f", radio, area(), perimetro());
    }
}