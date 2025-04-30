package section08;

public class ComputerProduct {
    private String model;
    private String manufacturer;

    // This can go to the Dimensions class -> Composition, so the all subclasses don't need to include these
    // private int width;
    // private int height;
    // private int depth;

    public ComputerProduct(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
/**
 * Inheritance defines an **IS A** relationship
 * Composition defines an **HAS A** relationship
 *
 * Inheritance is less flexible
 */




