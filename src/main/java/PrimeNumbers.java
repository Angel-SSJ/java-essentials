import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        boolean isPrime = true;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number < 2) {
            isPrime = false;
        } else {

            for (int i = 2; i <=Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number+ " isn't prime.");
        }
        }
}
