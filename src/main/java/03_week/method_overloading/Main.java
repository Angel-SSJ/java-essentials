//SobrecCarga de metodos
class Vehiculo{
    void mover(){System.out.println("Acelerando");}
    //void acelerar(int velocidad){System.out.println("Acelerando a una velocidad de " + velocidad);}


}

class Carro extends Vehiculo{
    void mover(){System.out.println("En la calle ");}

}

class Avion extends Vehiculo{
    void mover(){System.out.println("En el aeropuerto ");}

}

public class Main {
    public static void main(String[] args){

        Vehiculo vehiculo= new Vehiculo();
        Vehiculo carro = new Carro();
        Vehiculo avion = new Avion();

        vehiculo.mover();
        carro.mover();
        avion.mover();

    }
}