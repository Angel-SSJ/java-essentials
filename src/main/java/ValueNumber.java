import java.util.Scanner;

public class ValueNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        String result;
        boolean value = true;

        while (value) {
            System.out.print("Inserta un número: ");
            number = scanner.nextInt();

            result = number >= 0 ? "Numero positivo" : "Numero negativo";
            System.out.println(result);

            System.out.print("Desea continuar? (S/N): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("N")) {
                value = false;
                scanner.close();
            };
        }
    }
}

