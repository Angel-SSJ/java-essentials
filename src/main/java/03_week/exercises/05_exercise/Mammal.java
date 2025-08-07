/**
 * The type Mammal.
 */
public abstract class Mammal extends Animal {

    /**
     * Instantiates a new Mammal.
     *
     * @param name     the name
     * @param age      the age
     * @param gender   the gender
     * @param species  the species
     * @param isHunter the is hunter
     */
    public Mammal(String name, int age, String gender, String species, boolean isHunter){
        super(name,age,gender,species,isHunter, "Mammal");
    }



}