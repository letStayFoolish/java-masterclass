package section08.PolymorphismChallenge;

public class GasPoweredCar extends Car {
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        String type = this.getClass().getSimpleName();
        System.out.printf("You are driving a %s type car, with: %.2f km per litre gas powered car, cylinders: %d%n", type, avgKmPerLitre, cylinders);
    }

    @Override
    public void runEngine() {
//        super.runEngine();
        System.out.printf("%s powered car -> runEngine.", this.getClass().getSimpleName());
    }
}
