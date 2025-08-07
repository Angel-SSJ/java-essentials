public class Punto2D {
    private int x;
    private int y;
    // Constructor origen
    public Punto2D() {
        x = 0;
        y = 0;
    }
    // Constructor con coordenadas
    public Punto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    // Metodo distancia al origen
    public double distanciaOrigen() {
        return (Math.sqrt(x * x + y * y));
    }
    // Metodo para otro punto
    public double distanciaOtroPunto(int x2, int y2) {
        int dx = x - x2;
        int dy = y - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
    // Sobrecarga de metodos
    public double distanciaPuntoobjeto(Punto2D punto2) {
        int dx = x - punto2.getX();
        int dy = y - punto2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public class Main {
        public static void main(String[] args) {
            //Impresion de datos en consola
            Punto2D punto1 = new Punto2D();
            System.out.println("Coordenadas iniciales: (" + punto1.getX() + "," + punto1.getY() + ")");
            punto1.setX(12);
            punto1.setY(14);
            System.out.println("Coordenadas actualizadas: (" + punto1.getX() + "," + punto1.getY() + ")");
            System.out.println("Distancia al origen: " + punto1.distanciaOrigen());
            Punto2D punto2 = new Punto2D(4,6);
            System.out.println("Distancia a coordenadas (0,0):" + punto1.distanciaOtroPunto(0,0));
            System.out.println("Distancia a otro punto: " + punto1.distanciaPuntoobjeto(punto2));
        }
    }
}