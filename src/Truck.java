/**
 * Represents a Truck with various attributes such as color, engine quality,
 * tire quality, gas capacity, and a driver.
 */
public class Truck {

    /** The color of the truck */
    private String color;

    /** Engine quality on a 1–100 scale */
    private int engineQuality;

    /** Tire quality on a 1–100 scale */
    private int tireQuality;

    /** Gas capacity in liters */
    private int gasCapacity;

    /** Indicates whether the headlights are on */
    private boolean headlightsOn;

    /** Indicates whether the windshield wipers are on */
    private boolean windshieldWipersOn;

    /** The driver of the truck */
    private Person driver;

    /**
     * Constructs a Truck with all attributes specified.
     *
     * @param color the color of the truck
     * @param engineQuality the engine quality (1–100)
     * @param tireQuality the tire quality (1–100)
     * @param gasCapacity the gas capacity in liters
     * @param driver the driver of the truck
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
     * Constructs a Truck with a color and driver.
     * Other values are set to average defaults.
     *
     * @param color the color of the truck
     * @param driver the driver of the truck
     */
    public Truck(String color, Person driver) {
        this(color, 80, 80, 40, driver);
    }

    /**
     * Returns the color of the truck.
     *
     * @return the truck's color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the truck.
     *
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the engine quality.
     *
     * @return engine quality
     */
    public int getEngineQuality() {
        return engineQuality;
    }

    /**
     * Sets the engine quality.
     *
     * @param engineQuality the new engine quality
     */
    public void setEngineQuality(int engineQuality) {
        this.engineQuality = engineQuality;
    }

    /**
     * Returns the tire quality.
     *
     * @return tire quality
     */
    public int getTireQuality() {
        return tireQuality;
    }

    /**
     * Sets the tire quality.
     *
     * @param tireQuality the new tire quality
     */
    public void setTireQuality(int tireQuality) {
        this.tireQuality = tireQuality;
    }

    /**
     * Returns the gas capacity.
     *
     * @return gas capacity in liters
     */
    public int getGasCapacity() {
        return gasCapacity;
    }

    /**
     * Sets the gas capacity.
     *
     * @param gasCapacity the new gas capacity
     */
    public void setGasCapacity(int gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    /**
     * Simulates driving the truck.
     * Gas, tire quality, and engine quality decrease.
     */
    public void drive() {
        if (gasCapacity > 0 && engineQuality > 0 && tireQuality > 0) {
            gasCapacity -= 10;
            tireQuality -= 5;
            engineQuality -= 3;
            System.out.println(driver.getName() + " is driving.");
        } else {
            System.out.println("The truck cannot drive. Maintenance needed.");
        }
    }

    /**
     * Toggles the headlights on or off.
     */
    public void night() {
        headlightsOn = !headlightsOn;
        System.out.println("Headlights are now " +
                (headlightsOn ? "ON" : "OFF"));
    }

    /**
     * Simulates rainy conditions.
     * Windshield wipers turn on and tire quality decreases.
     */
    public void rain() {
        windshieldWipersOn = true;
        tireQuality -= 2;
        color = "Dirty";
        System.out.println("It is raining. Wipers are on.");
    }

    /**
     * Simulates a crash that heavily damages the truck.
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
     * Returns a description of the truck.
     *
     * @return a string describing the truck
     */
    @Override
    public String toString() {
        return "Truck (" + color + ", Engine: " + engineQuality +
                ", Tires: " + tireQuality +
                ", Gas: " + gasCapacity +
                "), driven by " + driver;
    }
}

