/**
 * Represents the driver of a truck.
 */
public class Person {

    private String name;

    /**
     * Constructs a new Person object.
     *
     * @param name The person's name.
     */
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the person.
     */
    @Override
    public String toString() {
        return name;
    }
}
