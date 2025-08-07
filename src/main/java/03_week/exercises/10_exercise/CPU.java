import java.util.Random;
/**
 * The type Cpu.
 */
public class CPU extends Component implements Temperature, Energy {
    /**
     * Instantiates a new Cpu.
     *
     * @param manufacturer the manufacturer
     * @param model the model
     */
    public CPU(String manufacturer, String model){
        super(manufacturer,model);
    }
    /**
     * Gets energy consumption.
     *
     * @return the energy consumption
     */
    @Override
    public double getEnergyConsumption() {
        return 65 + new Random().nextDouble()*30;
    }
    /**
     * Gets temperature.
     *
     * @return the temperature
     */
    @Override
    public double getTemperature() {
        return 30 + new Random().nextDouble()*50;
    }
    /**
     * Show details.
     */
    @Override
    public void showDetails(){
        System.out.println("CPU Details:");
        System.out.println("Manufacturer: "+getManufacturer());
        System.out.println("Model: "+getModel());
        System.out.println();
    }
    /**
     * Monitoring.
     */
    @Override
    public void Monitoring() {
        System.out.println("Monitoring CPU...");
        System.out.printf("Temperature: %.2f°C\n", getTemperature());
        System.out.printf("Energy Consumption: %.2f Watts\n", getEnergyConsumption());
        System.out.println();
    }
}