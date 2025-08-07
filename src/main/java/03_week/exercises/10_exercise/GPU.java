import java.util.Random;
/**
 * The type Gpu.
 */
public class GPU extends Component implements Temperature, Energy {
    /**
     * Instantiates a new Gpu.
     *
     * @param manufacturer the manufacturer
     * @param model the model
     */
    public GPU(String manufacturer, String model){
        super(manufacturer,model);
    }
    /**
     * Gets energy consumption.
     *
     * @return the energy consumption
     */
    @Override
    public double getEnergyConsumption() {
        return 120 + new Random().nextDouble()*100;
    }
    /**
     * Gets temperature.
     *
     * @return the temperature
     */
    @Override
    public double getTemperature() {
        return 35 + new Random().nextDouble()*60;
    }
    /**
     * Show details.
     */
    @Override
    public void showDetails(){
        System.out.println("GPU Details:");
        System.out.println("Manufacturer: "+getManufacturer());
        System.out.println("Model: "+getModel());
        System.out.println();
    }
    /**
     * Monitoring.
     */
    @Override
    public void Monitoring() {
        System.out.println("Monitoring GPU...");
        System.out.printf("Temperature: %.2f°C\n", getTemperature());
        System.out.printf("Energy Consumption: %.2f Watts\n", getEnergyConsumption());
        System.out.println();
    }
}