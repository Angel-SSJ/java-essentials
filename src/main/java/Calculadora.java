public class Calculadora {

    public static void main(String[] args) {
    }

    public double lastResult;

    public Calculadora() {
        this.lastResult = 0;
    }

    public double getLastResult() {
        return this.lastResult;
    }

    public double Sum(int a, int b) {
        lastResult = a + b;
        return this.lastResult;
    }

    public double Rest(int a, int b) {
        lastResult = a - b;
        return this.lastResult;
    }

    public double Division(int a, int b) {
        if (b != 0) {
            lastResult = a / b;
            return this.lastResult;
        } else {
            System.out.println("No se puede dividir por cero CHISTOSO");
        }
        return this.lastResult;
    }

    public double Multiply(int a, int b) {
        lastResult = a * b;
        return this.lastResult;
    }


    public void ShowLastResult() {
        System.out.println("El resultado de la ultima operacion es: " + this.lastResult);


    }
}