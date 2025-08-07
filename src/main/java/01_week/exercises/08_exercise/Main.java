import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isPrime = true;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        if(number<2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    System.out.println("Not prime");
                    }
                }
            }else{
            isPrime = true;
            System.out.println("Prime");
            }
        }
    }