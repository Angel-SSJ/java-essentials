import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        int number = 0;
        names.add("Angel");
        names.add("Karen");
        names.add("Cristina");
        names.add("Elizabeth");
        names.add("Jaime");
        names.add("Steven");
        names.add("Enrique");

        for (String name : names) {
            number++;
            System.out.println(number+"° -> "+ name);
        }

    }
}