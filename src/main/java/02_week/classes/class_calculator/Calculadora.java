public class Calculadora{
    private double ultimoResultado;

    public Calculadora(){
        this.ultimoResultado = 0;
    }

    public double getUltimoResultado(){
        return ultimoResultado;
    }

    public double sumar(double a, double b){
        ultimoResultado = a + b;
        return ultimoResultado;
    }
    public double restar(double a, double b){
        ultimoResultado = a - b;
        return ultimoResultado;
    }

    public double multiplicar(double a, double b){
        ultimoResultado = a * b;
        return ultimoResultado;
    }

    public double dividir(double a, double b){
        if(b !=0){
            ultimoResultado = a / b;
        }else{
            System.out.println("Error; División por cero");
            ultimoResultado = Double.NaN;
        }
        return  ultimoResultado;

    }
    public void mostrarUltimoResultado(){
        System.out.println("El ultimo resultado es: " + ultimoResultado);
    }
}