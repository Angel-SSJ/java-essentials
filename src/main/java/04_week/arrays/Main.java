import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,76,45,3, 2, 4,8,7, 5};
        String[] names = {"Angel", "Miguel", "Karen"};

        // length
        System.out.println("La longitud del array numbers: "+numbers.length);
        System.out.println("La longitud del array names: "+names.length);


        //Sorting an array
        System.out.println("Sorting...");
        Arrays.sort(numbers);
        System.out.println("Ordenado: "+ Arrays.toString(numbers));
        //System.out.println("Ordenado: "+ Arrays.deepToString(numbers));

        //BinarySearch()
        int position = Arrays.binarySearch(numbers,76);
        System.out.println("La posicion de 76 en el array es: "+position);


        // Equals
        int[] otherNumbers = {1,76,45,3, 2, 4,8,7, 5};
        //Arrays.sort(otherNumbers);
        boolean areEqual = Arrays.equals(numbers, otherNumbers);
        String result = areEqual ? "Son iguales" : "Son distintos";
        System.out.println(result);

        //Arrays.fill()
        Arrays.fill(numbers, 100);
        /*for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100;
        }*/
        System.out.println("Rellenando el array ne cada indice con numeros 100" + Arrays.toString(numbers));


        //Arrays.copy
        int[] copy =Arrays.copyOf(numbers, 5);
        System.out.println("Copia del array: "+ Arrays.toString(copy));


        //list
        System.out.println("List...");
        System.out.println(Arrays.asList(numbers));
        System.out.println(Arrays.asList(names));

        //Stream
        System.out.println("Stream...");
        System.out.println(Arrays.stream(numbers).sum());
        System.out.println(Arrays.stream(numbers));

        //Matrix
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));

    }
}