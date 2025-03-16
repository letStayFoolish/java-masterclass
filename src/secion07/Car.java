package secion07;

// public - means that any other class in any package can access this class.
// public, protected, null, private (used for encapsulation);
public class Car {
    /**
     * A `getter` is a method on a class that retrieves the value of a private field and returns it.
     * A `setter` is a method on a class that sets the value of a private field.
     * The purpose of these methods is to control and protect access to private fields.
     */

    // adding fields
    private String make = "Dacia";
    private String model = "Sandero stepway";
    private String color = "Lichen kaki";
    private int doors = 5;
    private boolean convertible = true;

    public String getModel(){
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // Setters
    /**
     * `this` is a special keyword in Java, refers to the instance that was created when the object is instantiated.
     * So, `this` is a special reference name for the object or instance, which it can use to describe itself.
     * We can use `this` to access fields on the class.
     */

    public void setMake(String company) {
        if(company == null) return;

        String lowercaseMake = company.toLowerCase();

        switch(lowercaseMake) {
            case "ford", "dacia", "audi" -> this.make = company;
            default -> this.make = "unsupported";
        }
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " +make + "-make" + model + "-model " + color + "-color");
    }
}
