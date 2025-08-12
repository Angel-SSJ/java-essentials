//Crea un HashMap y verifica si contiene un valor específico.

import java.util.HashMap;

public  class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");

        System.out.println(map.containsValue("value1"));
        System.out.println(map.containsValue("value7"));
    }
}