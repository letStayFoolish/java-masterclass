package section08.MasterChallenge;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item sideItem;

    public MealOrder() {
        this("regular", "coke", "cheese");
    }

    public MealOrder(String burgerType, String drinkType, String sideItemType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("drink", drinkType, 1.0);
        this.sideItem = new Item("side", sideItemType, 1.50);
    }

    public double getTotalPrice() {
            return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    };

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        sideItem.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE: $", getTotalPrice());
    }

    public void setExtraToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(Character drinkSize) {
        drink.setSize(drinkSize);
    }
}
