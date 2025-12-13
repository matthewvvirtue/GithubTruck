/**
 * Tester class for the Truck simulation project.
 */
public class Main {

    /**
     * The main method that runs the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Person objects
        Person driver1 = new Person("Alice");
        Person driver2 = new Person("Bob");

        // Create Truck objects using both constructors
        Truck truck1 = new Truck("Red", 100, 100, 60, driver1);
        Truck truck2 = new Truck("Blue", driver2);

        // Print trucks
        System.out.println(truck1);
        System.out.println(truck2);

        // Demonstrate behavior methods
        truck1.drive();
        truck2.drive();
        truck1.night();
        truck2.rain();
        truck1.crash();
    }
}

