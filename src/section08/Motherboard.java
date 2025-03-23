package section08;

public class Motherboard extends ComputerProduct {
    private int cardSlots;
    private int ramSLots;
    private String bios;
    Dimensions dimensions;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int cardSlots, int ramSLots, String bios, Dimensions dimensions) {
        super(model, manufacturer);

        this.cardSlots = cardSlots;
        this.ramSLots = ramSLots;
        this.bios = bios;
        this.dimensions = dimensions;
    }

    public void loadProgram(String programName) {
        System.out.println("Program: " + programName + " is loading...");
    }
}