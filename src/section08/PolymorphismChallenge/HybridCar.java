package section08.PolymorphismChallenge;

public class HybridCar extends Car {
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
