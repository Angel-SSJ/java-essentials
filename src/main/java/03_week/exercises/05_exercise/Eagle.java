/**
 * The type Eagle.
 */
public class Eagle extends Bird implements BirdInterface{

    /**
     * Instantiates a new Eagle.
     *
     * @param name   the name
     * @param age    the age
     * @param gender the gender
     */
    public Eagle(String name, int age, String gender){
        super(name,age,gender,"Aquila chrysaetos", true);
    }

    /**
     * Make sound.
     */
    @Override
    public void makeSound(){System.out.println("The eagle says: ROAR!");}

    /**
     * Eat.
     */
    @Override
    public void eat(){System.out.println("Eagle is eating");}

    /**
     * Sleep.
     */
    @Override
    public void sleep(){System.out.println("Eagle is sleeping");}

    /**
     * Fly.
     */
    @Override
    public void fly(){System.out.println("Eagle is flying");}

    /**
     * Glide.
     */
    @Override
    public void glide(){System.out.println("Eagle is gliding");}

    /**
     * Take off.
     */
    @Override
    public void takeOff(){System.out.println("Eagle is taking off");}

    /**
     * Land.
     */
    @Override
    public void land(){System.out.println("Eagle is landing");}

    /**
     * Lay eggs.
     */
    @Override
    public void layEggs(){System.out.println("Eagle lay eggs");}


    /**
     * Peck.
     */
    @Override
    public void peck(){System.out.println("Eagle pecks");}


    /**
     * Show details.
     */
    @Override
    public void showDetails(){

        System.out.println("| Eagle's Details: ");
        System.out.println("|  Name: " + getName());
        System.out.println("|  Age: " + getAge());
        System.out.println("|  Gender: " + getGender());
        System.out.println("|  Species: " + getSpecies());
        System.out.println("|  is Hunter?: "+getIsHunter());
        System.out.println("|  Taxonomic Category: "+getTaxonomicCategory());
        System.out.println("");
    }


}