/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Leon leon = new Leon("Gustavito",12,"Female");
        leon.showDetails();

        Eagle eagle = new Eagle("Ricardo",2,"Male");
        eagle.showDetails();

        Delfin delfin = new Delfin("Tortolito",3,"Female");
        delfin.showDetails();
    }
}