//Crea un HashSet de Strings, agrega elementos duplicados y muestra el contenido.


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");

        System.out.println(set);
    }
}