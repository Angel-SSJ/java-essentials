public class Main{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println("Realizando Operaciciones....");

        //suma
        calc.sumar(15, 7);
        calc.mostrarUltimoResultado();
        System.out.println("(Getter) Resultado: " + calc.getUltimoResultado());

        //resta
        calc.restar(20,8);
        calc.mostrarUltimoResultado();

        //multiplicar
        calc.multiplicar(5,6);
        calc.mostrarUltimoResultado();

        //division
        calc.dividir(20,4);
        calc.mostrarUltimoResultado();

        //division por cero
        calc.dividir(10, 0);
        calc.mostrarUltimoResultado();

    }
}