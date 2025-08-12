//Crea un HashMap y verifica si contiene una clave específica.


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println(map.containsKey("key1"));
        System.out.println(map.containsKey("key4"));
    }

}