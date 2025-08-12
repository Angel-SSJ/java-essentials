//Crea un ArrayList de Strings y verifica si contiene un nombre específico.

public class Main {
    public static void main(String[] args) {

        String[] names = {"Angel", "Juan", "Maria", "Pedro"};

        for (String name : names) {
            if (name.equals("Maria")) {
                System.out.println("El nombre es Maria");
            }
        }
    }

}