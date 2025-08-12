//Crea un HashMap con claves de tipo String y valores de tipo Integer, agrega elementos y muéstralos.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>(Arrays.asList("Angel","Cristina","Karen","Jaime","Elizabeth"));

        HashMap<String, Integer> map = new HashMap<>();

        for (int i =0; i<listNames.size(); i++){
            map.put(listNames.get(i), i+1);
        }



        System.out.println(map);

    }
}
