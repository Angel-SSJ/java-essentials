class Vehiculo{
    String brand;
    int age;

    Vehiculo(String brand, int age){
        this.brand = brand;
        this.age = age;
    }

    void ShowInfo(){
        System.out.println("Marca: "+brand+" Age: "+age);
    }

}

class Automovil extends Vehiculo{
    String model;
    int doors;

    Automovil(String model, int age,String brand, int doors){
        super(brand, age);
        this.model = model;
        this.doors = doors;
    }

    @Override
    void ShowInfo(){
        super.ShowInfo();
        System.out.println("Numero de puertas: "+doors);
        System.out.println("Modelo: "+model);

    }

}

public class Main{
    public static void main(String[] args){
        Automovil auto = new Automovil("Corolla", 2018, "Toyota",5);
        auto.ShowInfo();
    }
}

