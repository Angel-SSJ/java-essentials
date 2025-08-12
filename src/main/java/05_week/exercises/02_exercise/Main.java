//Crea un ArrayList de números enteros, elimina un número específico y muestra la lista actualizada.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int valueLimit=10;
        for(int i=0;i<valueLimit;i++){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}