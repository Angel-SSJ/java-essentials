public class MainCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();


        System.out.println("Realizando operaciones....");

        //sum
        calc.sum(15,7);
        System.out.println(calc.getLastResult());


        // rest
    }
}