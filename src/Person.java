/**
 * Represents a person who can act as the driver of a truck.
 */
public class Person {

    /** The name of the person */
    private String name;

    /**
     * Constructs a new Person with a given name.
     *
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the person's name.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name.
     *
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return the person's name
     */
    @Override
    public String toString() {
        return name;
    }
}
