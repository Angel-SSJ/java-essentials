import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        String answer;
        boolean value =true;
        System.out.println("Ingresa un valor: ");
        number = scanner.nextInt();
        while (value){


            if(number%2==0){
                System.out.print("El valor ingresado es " + number);
                System.out.println(", el cual es par");
            }else{
                System.out.print("El valor ingresado es " + number);
                System.out.println(", el cual es impar");
            }

            System.out.println("Quieres seguir jugando");
            answer = scanner.next();
            if(answer.equalsIgnoreCase("N")){
             value = false;

            }
            System.out.println("Quieres cambiar el valor (N/S)");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("S")) {
                System.out.println("Ingresa un nuevo valor");
                number = scanner.nextInt();
            }
        }
    }
}