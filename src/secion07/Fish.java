package secion07;

import java.util.Objects;

public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super("Shark", (weight < 100 ? "small" : (weight < 180 ? "medium" : "huge")), 150);

        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.print("Muscle movement. ");
    }

    public void moveBackFins() {
        System.out.print("Back fins movement. ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        moveMuscles();
        if(Objects.equals(speed, "fast")) {
            moveBackFins();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
