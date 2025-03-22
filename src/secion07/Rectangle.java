package secion07;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // Calls 2nd constructor;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // Calls constructor from parent class (Shape);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
