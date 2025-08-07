/**
 * The type Animal.
 */
public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String species;
    private boolean isHunter;
    private String taxonomicCategory;

    /**
     * Instantiates a new Animal.
     *
     * @param name              the name
     * @param age               the age
     * @param gender            the gender
     * @param species           the species
     * @param isHunter          the is hunter
     * @param taxonomicCategory the taxonomic category
     */
    public Animal(String name, int age, String gender ,String species, boolean isHunter,String taxonomicCategory){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.species = species;
        this.isHunter = isHunter;
        this.taxonomicCategory = taxonomicCategory;
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){ return name;};

    /**
     * Get age int.
     *
     * @return the int
     */
    public int getAge(){return age;};

    /**
     * Get gender string.
     *
     * @return the string
     */
    public String getGender(){return gender;}

    /**
     * Get species string.
     *
     * @return the string
     */
    public String getSpecies(){return species;}

    /**
     * Get is hunter boolean.
     *
     * @return the boolean
     */
    public boolean getIsHunter(){return isHunter;}

    /**
     * Get taxonomic category string.
     *
     * @return the string
     */
    public String getTaxonomicCategory(){return taxonomicCategory;}

    /**
     * Set is hunter.
     *
     * @param isHunter the is hunter
     */
    public void setIsHunter(boolean isHunter){this.isHunter = isHunter;}

    /**
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name){this.name = name;}

    /**
     * Set age.
     *
     * @param age the age
     */
    public void setAge(int age){this.age = age;}

    /**
     * Set gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender){this.gender = gender;}

    /**
     * Set species.
     *
     * @param species the species
     */
    public void setSpecies(String species){this.species = species;}

    /**
     * Set taxonomic category.
     *
     * @param taxonomicCategory the taxonomic category
     */
    public void setTaxonomicCategory(String taxonomicCategory){this.taxonomicCategory = taxonomicCategory;}


    /**
     * Show details.
     */
    public abstract void showDetails();


}