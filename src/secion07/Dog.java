package secion07;

public class Dog extends Animal {

    public Dog () {
        /**
         * super() is lot like a `this()`.
         * It is a way to call a constructor on a super class directly from the sub class's constructor.
         * like `this()` it has to be the first statement of the constructor.
         */
        super("Terier", "Huge", 350); // calls default constructor from Animal
    }
}
