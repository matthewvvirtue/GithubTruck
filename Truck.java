/**
 * Represents a Truck with various attributes such as color, engine quality,
 * tire quality, gas capacity, and its driver.
 */
public class Truck {

    // Instance variables
    private String color;
    private int engineQuality;     // 1–100 scale
    private int tireQuality;       // 1–100 scale
    private int gasCapacity;       // in liters
    private boolean headlightsOn;
    private boolean windshieldWipersOn;
    private Person driver;         // secondary object class

    /**
     * Constructs a new Truck object with all attributes specified.
     *
     * @param color              The color of the truck.
     * @param engineQuality      The engine quality (1–100 scale).
     * @param tireQuality        The tire quality (1–100 scale).
     * @param gasCapacity        The gas capacity (liters).
     * @param driver             The driver of the truck.
     */
    public Truck(String color, int engineQuality, int tireQuality,
                 int gasCapacity, Person driver) {

        this.color = color;
        this.engineQuality = engineQuality;
        this.tireQuality = tireQuality;
        this.gasCapacity = gasCapacity;
        this.headlightsOn = false;
        this.windshieldWipersOn = false;
        this.driver = driver;
    }

    /**
     * Overloaded constructor that creates a basic truck with a color and driver.
     * Other values default to “average”.
     *
     * @param color  The truck’s color.
     * @param driver The driver of the truck.
     */
    public Truck(String color, Person driver) {
        this(color, 80, 80, 40, driver);
    }

    // ---------------- Getters & Setters ----------------

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineQuality() {
        return engineQuality;
    }

    public void setEngineQuality(int engineQuality) {
        this.engineQuality = engineQuality;
    }

    public int getTireQuality() {
        return tireQuality;
    }

    public void setTireQuality(int tireQuality) {
        this.tireQuality = tireQuality;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(int gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public boolean isHeadlightsOn() {
        return headlightsOn;
    }

    public void setHeadlightsOn(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }

    public boolean isWindshieldWipersOn() {
        return windshieldWipersOn;
    }

    public void setWindshieldWipersOn(boolean windshieldWipersOn) {
        this.windshieldWipersOn = windshieldWipersOn;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    // ---------------- Behavior Methods ----------------

    /**
     * Simulates driving the truck. Decreases gas, tire quality, and engine quality.
     */
    public void drive() {
        if (gasCapacity > 0 && engineQuality > 0 && tireQuality > 0) {
            gasCapacity -= 10;
            tireQuality -= 5;
            engineQuality -= 3;
            System.out.println(driver.getName() + " is driving. Gas: " 
                + gasCapacity + ", Tire Quality: " + tireQuality 
                + ", Engine Quality: " + engineQuality);
        } else {
            System.out.println("The truck cannot drive. Maintenance needed.");
        }
    }

    /**
     * Toggles the headlights.
     */
    public void night() {
        headlightsOn = !headlightsOn;
        System.out.println("Headlights are now " + (headlightsOn ? "ON" : "OFF"));
    }

    /**
     * Simulates rain, which activates wipers and reduces tire quality.
     */
    public void rain() {
        windshieldWipersOn = true;
        tireQuality -= 2;
        color = "Dirty";
        System.out.println("It’s raining. Wipers ON. Tire Quality: " 
            + tireQuality + ", Color: " + color);
    }

    /**
     * Simulates a crash that damages the truck heavily.
     */
    public void crash() {
        color = "Damaged";
        engineQuality -= 50;
        tireQuality -= 50;
        gasCapacity -= 20;
        headlightsOn = false;
        windshieldWipersOn = false;

        System.out.println("Crash! The truck is damaged.");
    }

    /**
     * Returns a text description of the truck.
     */
    @Override
    public String toString() {
        return "Truck (" + color + ", Engine: " + engineQuality + ", Tires: "
                + tireQuality + ", Gas: " + gasCapacity + "), driven by " + driver;
    }
}
