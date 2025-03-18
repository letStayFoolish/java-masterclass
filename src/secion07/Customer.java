package secion07;

public class Customer {

    private String name;
    private String emailAddress;
    private double creditLimit;

    // No arguments class constructor
    public Customer() {
        // another constructor - 2-parameters
        this("Chili", "chiliue@email.com"); // chaining -> it will take `creditLimit` from default defined constructor (line: 16)
        // it will take credit limit for passing w-arguments constructor, as we made (one line up) another constructor passing TWO parameters.
    }

    // Two-parameters constructor - Pass only name and email class constructor
    public Customer(String name, String emailAddress) {
        this(name, emailAddress, 5000.00); // calling another constructor
    }

    // Pass all needed arguments class constructor
    public Customer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }
}
