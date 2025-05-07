package section08.MasterChallenge;

public class DeluxeBurger extends Burger {
    Item deluxe1;
    Item deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extraTopping1, String extraTopping2, String extraTopping3, String extraDeluxe1, String extraDeluxe2) {
        super.addToppings(extraTopping1, extraTopping2, extraTopping3);
        deluxe1 = new Item("TOPPING", extraDeluxe1,0);
        deluxe2 = new Item("TOPPING", extraDeluxe2,0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(deluxe1 != null) deluxe1.printItem();
        if(deluxe2 != null) deluxe2.printItem();
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
