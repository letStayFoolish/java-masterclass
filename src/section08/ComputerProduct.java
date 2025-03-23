package section08;

public class ComputerProduct {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public ComputerProduct(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends ComputerProduct {
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);

        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color %s ", x, y, color
        ));
    }
}


class Motherboard extends ComputerProduct {
    private int cardSlots;
    private int ramSLots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int cardSlots, int ramSLots, String bios) {
        super(model, manufacturer);

        this.cardSlots = cardSlots;
        this.ramSLots = ramSLots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program: " + programName + " is loading...");
    }
}

class ComputerCase extends ComputerProduct {
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed!");
    }
}

/**
 * Inheritance defines an **IS A** relationship
 * Composition defines an **HAS A** relationship
 */