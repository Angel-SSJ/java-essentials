public class Main {


    public double calcularPromedio(int[] numeros) {
        int sum = 0;
        for (int i = 0; i<numeros.length; i++){
            sum += numeros[i];
        }
        return (double) sum/numeros.length;
    }

    public int encontrarMaximo(int[] numeros){
        int max = 0;
        for (int i = 0; i<numeros.length; i++){
            if(numeros[i]>max){
                max = numeros[i];
            }
        }
        return (int) max;
    }

    public int encontrarMinimo(int[] numeros){
        int min = numeros[1];
        for (int i = 0; i<numeros.length; i++){
            if(numeros[i]<min){
                min = numeros[i];
            }
        }
        return (int) min;
    }






    public static void main(String[] args) {
        int[] numeros = {5,10,15,20,25};
        Main calc = new Main();
        double promedio  = calc.calcularPromedio(numeros);
        System.out.println("Promedio: "+promedio);

        int maximo = calc.encontrarMaximo(numeros);
        System.out.println("Máximo: "+maximo);

        int minimo = calc.encontrarMinimo(numeros);
        System.out.println("Mínimo: "+minimo);



    }
}
