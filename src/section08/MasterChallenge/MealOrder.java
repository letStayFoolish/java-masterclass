package section08.MasterChallenge;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item sideItem;

    public MealOrder() {
        this("regular", "coke", "cheese");
    }

    public MealOrder(String burgerType, String drinkType, String sideItemType) {
        if(burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.0);
        this.sideItem = new Item("side", sideItemType, 1.50);
    }

    public double getTotalPrice() {
        if(this.burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    };

    public void printItemizedList() {
        burger.printItem();
        if(this.burger instanceof DeluxeBurger) {
            Item.printItem(this.drink.getName(), 0);
            Item.printItem(this.sideItem.getName(), 0);
        } else {
            drink.printItem();
            sideItem.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE: $", getTotalPrice());
    }

    public void setExtraToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }


    public void setExtraToppings(String extra1, String extra2, String extra3, String extraDeluxe1, String extraDeluxe2) {
        if (this.burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extraDeluxe1, extraDeluxe2);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String drinkSize) {
        drink.setSize(drinkSize);
    }
}
