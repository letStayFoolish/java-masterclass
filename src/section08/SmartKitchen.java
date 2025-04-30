//public class SmartKitchen {
//    private CoffeeMaker brewMaster;
//    private DishWasher dishWasher;
//    private Refrigerator iceBox;
//
//    public SmartKitchen() {
//        brewMaster = new CoffeeMaker();
//        dishWasher = new DishWasher();
//        iceBox = new Refrigerator();
//    }
//
//    public CoffeeMaker getCoffeeMaker() {
//        return brewMaster;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public Refrigerator getIceBox() {
//        return iceBox;
//    }
//
//    public void setKitchenState(boolean coffeeFlag, boolean dishesFlag, boolean foodFlag) {
//        brewMaster.setHasWorkToDo(coffeeFlag);
//        dishWasher.setHasWorkToDo(dishesFlag);
//        iceBox.setHasWorkToDo(foodFlag);
//    }
//
//    public void doKitchenWork() {
//        brewMaster.brewCoffee();
//        dishWasher.doDishes();
//        iceBox.orderFood();
//    }
//}
//
//class CoffeeMaker {
//    private boolean hasWorkToDo;
//
//    public void setHasWorkToDo(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }
//
//    public void brewCoffee() {
//        if(hasWorkToDo) {
//            System.out.println("Coffee making done.");
//            this.hasWorkToDo = false;
//        }
//    }
//}
//
//class DishWasher {
//    private boolean hasWorkToDo;
//
//    public void setHasWorkToDo(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }
//
//    public void doDishes() {
//        if(hasWorkToDo) {
//            System.out.println("Dishes washing done.");
//            this.hasWorkToDo = false;
//        }
//    }
//}
//
//class Refrigerator {
//    private boolean hasWorkToDo;
//
//    public void setHasWorkToDo(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }
//
//    public void orderFood() {
//        if(hasWorkToDo) {
//            System.out.println("Ordering food done.");
//            this.hasWorkToDo = false;
//        }
//    }
//}