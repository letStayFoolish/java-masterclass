package section08.PolymorphismChallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    };

    public void startEngine() {
        String instanceType = this.getClass().getSimpleName();
        // System.out.printf(this.description + " -> startEngine. ", instanceType);
        System.out.println("Car -> startEngine.");
    };
    public void drive() {
        String type = this.getClass().getSimpleName();
        System.out.println("Car -> drive, type is " + type);
        this.runEngine();
    };
    protected void runEngine() {
        System.out.println("Car -> runEngine.");
    };
}
