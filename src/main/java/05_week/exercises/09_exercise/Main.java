//Implementa un método que realice búsqueda lineal en un arreglo de enteros.

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 10;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
    }
}