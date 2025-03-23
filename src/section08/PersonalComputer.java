package section08;

public class PersonalComputer extends ComputerProduct {
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
        monitor.drawPixelAt(10, 10, "yellow");
    }

    public void powerUp() {
        motherboard.loadProgram("Windows OS");
        computerCase.pressPowerButton();
        drawLogo();
    }
}
