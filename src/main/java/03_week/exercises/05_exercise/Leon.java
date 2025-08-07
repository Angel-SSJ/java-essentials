/**
 * The type Leon.
 */
public class Leon extends Mammal implements Land{

    /**
     * Instantiates a new Leon.
     *
     * @param name   the name
     * @param age    the age
     * @param gender the gender
     */
    public Leon(String name, int age, String gender ) {
        super(name,age,gender,"Panthera leo",true);
    }

    /**
     * Make sound.
     */
    @Override
    public void makeSound(){
        System.out.println("Leon says: 'Grrr'");
    }

    /**
     * Eat.
     */
    @Override
    public void eat(){
        System.out.println("Leon is eatings");
    }

    /**
     * Sleep.
     */
    @Override
    public void sleep(){
        System.out.println("Leon is sleeping");
    }

    /**
     * Run.
     */
    @Override
    public void run(){
        System.out.println("Leon is running");
    }

    /**
     * Walk.
     */
    @Override
    public void walk(){
        System.out.println("Leon is walking");
    }

    /**
     * Dig.
     */
    @Override
    public void dig(){System.out.println("Leon is digings");}

    /**
     * Track.
     */
    @Override
    public void track(){System.out.println("Leon is tracking few preys");}

    /**
     * Show details.
     */
    @Override
    public void showDetails(){

        System.out.println("| Leon's Details: ");
        System.out.println("|  Name: " + getName());
        System.out.println("|  Age: " + getAge());
        System.out.println("|  Gender: " + getGender());
        System.out.println("|  Species: " + getSpecies());
        System.out.println("|  is Hunter?: "+getIsHunter());
        System.out.println("|  Taxonomic Category: "+getTaxonomicCategory());
        System.out.println("");
    }



}