public class Circulo {
    private double radio;
    // Constructor por defecto
    public Circulo() {
        this.radio = 1.0;
    }
    // Constructor con valor
    public Circulo(double radio) {
        this.radio = radio;
    }
    // Getter
    public double getRadio() {
        return radio;
    }
    // Setter con validacion
    public void setRadio(double radio) {
        if (radio > 0){
            this.radio = radio;
        } else {
            System.out.println("El radio no puede ser menor que 0");
        }
    }
    // Metodo para calcular el area
    public double calcularArea() {
        return Math.pow(this.radio, 2);
    }
    // Metodo para la circunferencia
    public double circunference() {
        return Math.round((Math.PI * Math.pow(2, radio)) *100) /100.0;
    }
    // Sobrecarga para calcular area con radio parametro
    public double calcularArea (double radio2){
        if (radio2 > 0){
            return Math.round((Math.PI * radio2 * radio2) * 100) / 100.0 ;
        }else {
            System.out.println("El radio no puede ser menor que 0");
            return 0;
        }
    }
    public static class Main{
        public static void main(String[] args) {
            //Impresion de datos en consola
            Circulo circulo1 = new Circulo(3);
            Circulo circulo2 = new Circulo(2);
            Circulo circulo3 = new Circulo();
            System.out.println("Area de circulo 1: " + circulo1.calcularArea());
            System.out.println("Area de circulo 2: " + circulo2.calcularArea());
            System.out.println("Area de circulo 3: " + circulo3.calcularArea());
            System.out.println("Area de circulo 1 con radio 11: " + circulo1.calcularArea(11));
            System.out.println("Circunferencia de circulo 2: " + circulo2.circunference());
            System.out.println("Circunferencia de circulo 3: " + circulo3.circunference());
        }
    }
}
