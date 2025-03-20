package secion07;

public class Floor {
    private double width;
    private double length;

    public Floor(double length, double width) {
        this.length = length > 0 ? length : 0;
        this.width  = width  > 0 ? width  : 0;
    }

    public double getArea(){
        return this.length * this.width;
    }
}
