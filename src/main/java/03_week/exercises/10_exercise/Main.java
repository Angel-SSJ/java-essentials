
/**
 * The type Main.
 */
public class Main {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Component cpu = new CPU("AMD","Ryzen 9 9950X");
        Component gpu = new GPU("NVIDIA", "RTX 4080 SUPER");
        cpu.Monitoring();
        cpu.showDetails();
        gpu.Monitoring();
        gpu.showDetails();
    }
}