/**
 * The type Bird.
 */
public abstract class Bird extends Animal {

    /**
     * Instantiates a new Bird.
     *
     * @param name     the name
     * @param age      the age
     * @param gender   the gender
     * @param species  the species
     * @param isHunter the is hunter
     */
    public Bird(String name, int age, String gender, String species, boolean isHunter){
        super(name,age,gender,species,isHunter,"Bird");
    }



}