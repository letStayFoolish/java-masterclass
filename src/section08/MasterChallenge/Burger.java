package section08.MasterChallenge;

public class Burger extends Item {
    private Item extraItem1;
    private Item extraItem2;
    private Item extraItem3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() + (extraItem1 == null ? 0 : extraItem1.getAdjustedPrice()) + (extraItem2 == null ? 0 : extraItem2.getAdjustedPrice()) + (extraItem3 == null ? 0 : extraItem3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extraTopping1, String extraTopping2, String extraTopping3) {
        this.extraItem1 = new Item("TOPPING", extraTopping1, getExtraPrice(extraTopping1));
        this.extraItem2 = new Item("TOPPING", extraTopping2, getExtraPrice(extraTopping2));
        this.extraItem3 = new Item("TOPPING", extraTopping3, getExtraPrice(extraTopping3));
    }

    public void printItemizedList () {
        printItem("BASE BURGER", getBasePrice());
        if (extraItem1 != null) {
            extraItem1.printItem();
        }
        if (extraItem2 != null) {
            extraItem2.printItem();
        }
        if (extraItem3 != null) {
            extraItem3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
