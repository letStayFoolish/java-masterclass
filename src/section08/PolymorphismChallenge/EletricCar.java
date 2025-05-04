package section08.PolymorphismChallenge;

public class EletricCar extends Car {
    double avgKmPerCharge;
    int batterySize;

    public EletricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        super.drive();
        String type = this.getClass().getSimpleName();
        System.out.printf("You are driving a %s type car, with: %.2f km per charge electric car, battery size: %d%n", type, avgKmPerCharge, batterySize);
    }
}
