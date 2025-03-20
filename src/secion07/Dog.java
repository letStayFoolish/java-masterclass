package secion07;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog () {
        /**
         * super() is lot like a `this()`.
         * It is a way to call a constructor on a super class directly from the sub class's constructor.
         * like `this()` it has to be the first statement of the constructor.
         */
        super("Mutt", "Big", 50); // calls default constructor from Animal
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);

        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        bark();
        System.out.println();
    }

    /**
     * The overridden method can do one of three things:
     * 1. It can implement completely different behaviour, overriding the behaviour of the parent.
     * 2. It can simply call the parent's method - redundant to do.
     * 3. Or it can call the parent's class method and include other code (extends functionality).
     * @param speed
     */
    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");

        if(speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            wagTail();
        }

        System.out.println();
    }

    private void bark() {
        System.out.print("Woof!");
    }

    private void run() {
        System.out.print("Dog running ");
    }

    private void walk() {
        System.out.print("Dog walking ");
    }

    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
}
