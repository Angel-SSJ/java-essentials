//estructura que se ocupa en java para guardar estructuras del estilo [key:value]
///https://www.w3schools.com/java/java_hashmap.asp

import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Angel",19);
        ages.put("Dulce",18);
        ages.forEach(
                (key,value) -> System.out.println(key+": "+value));




        for(String key: ages.keySet()){
            System.out.println(key+": "+ages.get(key));
        }

        HashMap <String, String> capitalizes = new HashMap<>();
        capitalizes.put("Honduras", "Tegucigalpa");
        capitalizes.put("Peru", "Lima");
        capitalizes.put("Chile", "Santiago");
        capitalizes.put("Argentina", "Buenos Aires");
        capitalizes.put("Brazil", "Brasilia");
        capitalizes.put("Mexico", "Mexico City");

        if(capitalizes.containsKey("Honduras")){
            System.out.println("La capital de Honduras es: "+capitalizes.get("Honduras"));
        }

        capitalizes.remove("Honduras");
        System.out.println(capitalizes);
    }
}