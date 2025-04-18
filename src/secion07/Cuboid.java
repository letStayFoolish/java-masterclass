package secion07;

public class Cuboid extends RectangleSwim {
    private double height;

    public Cuboid (double width, double length, double height) {
        super(width, length);
        this.height = height > 0 ? height : 0;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
