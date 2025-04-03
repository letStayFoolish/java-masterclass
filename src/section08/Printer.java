package section08;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0; // by default
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
     int tempAmount = tonerAmount + this.tonerLevel;

     if(tempAmount > 100 || tempAmount < 0) {
         return -1;
     }

     this.tonerLevel += tonerAmount;

     return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = this.duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += pagesToPrint;

        if (this.duplex) {
            System.out.println("This is a duplex printer.");
        }

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
