//Crea un HashSet de enteros y verifica si un número existe en el conjunto.

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int value=10;
        int valueEvaluator =11;
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // evaluating if the value exists
        System.out.println(numbers.contains(valueEvaluator));

    }

}