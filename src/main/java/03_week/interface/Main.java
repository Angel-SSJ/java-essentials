interface Encencible{
    void Encender();
    void Apagar();
}

class Foco implements Encencible{
    //@Override
    public void Encender() {
        System.out.println("Encendiendo Foco");
    }
    //@Override
    public void Apagar() {
        System.out.println("Apagando Foco");
    }
}

public class Main{
    public static void main(String[] args){
        Encendible foco = new Foco();
        foco.Encender();
        foco.Apagar();
    }
}