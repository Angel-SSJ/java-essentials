import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result;
        String answer;
        boolean value = true;
        System.out.println("Welcome to the even or odd program!");
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        while (value) {
            result = number%2==0? "It's even" : "It's odd";
            System.out.println(result);

            System.out.println("Do you want to continue? (Y/N)");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("N")) {
                value = false;
            }

            System.out.println("Do you want to change the number? (Y/N): ");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("Enter a new number: ");
                number = scanner.nextInt();
            }
        }

    }
}