/**
 * The type Delfin.
 */
public class Delfin extends Mammal implements Aquatic{

    /**
     * Instantiates a new Delfin.
     *
     * @param name   the name
     * @param age    the age
     * @param gender the gender
     */
    public Delfin(String name, int age, String gender){
        super(name,age,gender,"Delphinidae", true);
    }

    /**
     * Make sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Delfin makes: 'AAk '");
    }

    /**
     * Eat.
     */
    @Override
    public void eat(){
        System.out.println("Delfin is eatings");
    }

    /**
     * Sleep.
     */
    @Override
    public void sleep(){
        System.out.println("Delfin is sleeping");
    }

    /**
     * Swim.
     */
    @Override
    public void swim(){System.out.println("Delfin is swimming");}

    /**
     * Dive.
     */
    @Override
    public void dive(){System.out.println("Delfin is diving");}

    /**
     * Emerge.
     */
    @Override
    public void emerge(){System.out.println("Delfin is emerging");}

    /**
     * Show details.
     */
    @Override
    public void showDetails(){

        System.out.println("| Delfin's Details: ");
        System.out.println("|  Name: " + getName());
        System.out.println("|  Age: " + getAge());
        System.out.println("|  Gender: " + getGender());
        System.out.println("|  Species: " + getSpecies());
        System.out.println("|  is Hunter?: "+getIsHunter());
        System.out.println("|  Taxonomic Category: "+getTaxonomicCategory());
        System.out.println("");
    }
}