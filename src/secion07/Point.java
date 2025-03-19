package secion07;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

//    double calcDist(int xA, int xB, int yA, int yB) {
//        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
//    }

    public double distance() {
        return distance(0, 0);
    };

    // Method named distance with parameter of type Point, it needs to return the distance between this Point and the parameter Point as a double.
    public double distance(Point point) {
        return distance(point.x, point.y);
    };

    // Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as a double.
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    };
}
