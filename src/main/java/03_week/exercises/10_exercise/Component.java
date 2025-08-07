/**
 * The type Component.
 */
public abstract class Component {
    //Variables
    private String manufacturer;
    private String model;
    /**
     * Instantiates a new Component.
     *
     * @param manufacturer the manufacturer
     * @param model the model
     */
    public Component(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }
    /**
     * Sets model.
     *
     * @param model the model
     * @return the model
     */
    public String setModel(String model) {
        return this.model = model;
    }
    /**
     * Sets manufacturer.
     *
     * @param manufacturer the manufacturer
     * @return the manufacturer
     */
    public String setManufacturer(String manufacturer) {
        return this.manufacturer = manufacturer;
    }
    /**
     * Get model string.
     *
     * @return the string
     */
    public String getModel(){return model;}
    /**
     * Get manufacturer string.
     *
     * @return the string
     */
    public String getManufacturer(){return manufacturer;}
    /**
     * Monitoring.
     */
    public abstract void Monitoring();
    /**
     * Show details.
     */
    public abstract void showDetails();
}