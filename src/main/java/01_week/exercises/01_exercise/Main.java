import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result;
        boolean value = true;

        while(value) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            result = number >=0 ?"It's positive ":"It's negative";
            System.out.println(result);

            System.out.println("Do you want to enter another number(Y/N): ");
            String input = scanner.next();

            if(input.equalsIgnoreCase("N")) {
                value = false;
                scanner.close();
            };
        }

    }
}