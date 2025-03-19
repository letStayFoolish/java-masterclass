package secion07;

public class Person {

    /**
     * Constructor is used in the creation of the object
     * It is a special type of code block that has a specific name and parameters, much like a method.
     * Same name as the class itself, it doesn't return any values - never include return type!
     *
     * The purpose of constructor is to essentially initialize the object that we are creating - called only once;
     */
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


    public int getAge () {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
