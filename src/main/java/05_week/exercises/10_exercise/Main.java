//Implementa un método que realice búsqueda binaria en un arreglo ordenado de enteros.
//https://www.freecodecamp.org/news/how-to-implement-a-binary-search-algorithm-in-java-without-recursion-67d9337fd75f/
//https://medium.com/nerd-for-tech/binary-search-algorithm-using-java-3c7c24d783cf


import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] names = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println(Collections.binarySearch(names, 1));

    }
}