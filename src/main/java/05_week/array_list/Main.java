import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        nombres.add("Pedro");
        nombres.add("Juliana");
        nombres.add("Sara");
        nombres.add("Dulce");

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("---------------------------");
        System.out.println("EL primer datos es:"+ numeros.get(0));
        System.out.println("---------------------------");
        System.out.println("EL ultimo datos es:"+ numeros.get(numeros.size()-1));
        System.out.println("---------------------------");
        System.out.println("Cantidad de numeros:"+ numeros.size());

        System.out.println("---------------------------");
        System.out.println("El nombre 'Dulce' se encuentra en el array? :"+ nombres.contains( "Dulce"));

    }
}

