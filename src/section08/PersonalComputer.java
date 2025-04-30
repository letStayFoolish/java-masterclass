package section08;

public class PersonalComputer extends ComputerProduct {
    /**
     * Use Composition over Inheritance!!! (whenever it is possible/make sense)
     * Composition - more flexible
     * PersonalComputer IS A instance of ComputerProduct, and HAS A Monitor, Motherboard, ComputerCase
     * PersonalComputer is composed of three other classes: Monitor, Motherboard, ComputerCase
     *
     * Inheritance is less flexible. Adding a class or removing a class from a class hierarchy may impact all classes from that point.
     * In addition, a new subclass may not need all the functionality or attributes of its parent class.
     */

    private Motherboard motherboard;
    private Monitor monitor;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard, Monitor monitor, ComputerCase computerCase) {
        super(model, manufacturer);

        this.motherboard = motherboard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    // Inheritance - less flexible
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }

    // Composition
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows OS");
    }
}
