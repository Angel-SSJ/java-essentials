public class Automovil extends Vehiculo implements Motorizable {
    //Constructor hijo
    public Automovil(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }
    //Metodo para encender el automovil
    @Override
    public void encender() {
        System.out.println("El automóvil está encendido.");
    }
    //Metodo para apagar el automovil
    @Override
    public void apagar() {
        System.out.println("El automóvil está apagado.");
    }
}
