public class Motocicleta extends Vehiculo implements Motorizable {
    //Constructor hijo
    public Motocicleta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }
    //Metodo para encender la motocicleta
    @Override
    public void encender() {
        System.out.println("La motocicleta está encendida.");
    }
    //Metodo para apagar la motocicleta
    @Override
    public void apagar() {
        System.out.println("La motocicleta está apagada.");
    }
}