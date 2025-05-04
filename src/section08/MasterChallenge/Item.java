package section08.MasterChallenge;

public class Item {
    private String type;
    private String name;
    private double price;
    private Character size = 'M';

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch(size) {
            case 'S' -> getBasePrice() - 0.5;
//            case 'M' -> getBasePrice() + 0.5;
            case 'L' -> getBasePrice() + 1.5;
            default -> getBasePrice();
        };
    }

    public void setSize(Character size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s: %6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
