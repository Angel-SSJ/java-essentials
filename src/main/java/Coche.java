public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public void main(String[] args) {

    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
    }

    public void frenar(int decremento) {
        velocidad = Math.max(0, velocidad - decremento);
        System.out.println("Frenando... Velocidad actual: " + velocidad + " km/h");
    }
}