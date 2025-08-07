interface Encencible{
    void encender();
    void apagar();
}

class Foco implements Encencible{
    //@Override
    public void encender() {
        System.out.println("Encendiendo Foco");
    }
    //@Override
    public void apagar() {
        System.out.println("Apagando Foco");
    }
}

public class Main{
    public static void main(String[] args){
        Encencible foco = new Foco();
        foco.encender();
        foco.apagar();
    }
}