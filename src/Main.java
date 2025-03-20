import secion07.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // public - means that any other class in any package can access this class.
    // if it is null (omitted) - package access / the class is accessible only to classes in the same package.

    // Static vs Instance
    // Whenever you see method that doesn't use instance variables, that method should probably be declared as STATIC method!
    // main method is static method, it is called by java Virtual Machine (JVM) when it starts the Java application.

    // static methods do not required an instance to be created (ClassName.methodName()) or if in the same class (just methodName());
    // When to create Static/Instance method? Does it use any fields (instance variables) or instance methods? (if YES - instance method, if NOT - static method);

    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        System.out.println("Make: " + car.getMake());

        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor ());
        car.setMake("Honda");
        car.setMake("Audi");

        System.out.println("Make: " + car.getMake());
        // ==========================================

        // Person class
        Person newPerson = new Person("Nemanja");
        Person irinaPerson = new Person("Karaklajic", 32);
        System.out.println(newPerson.getFirstName());
        System.out.println(irinaPerson.getLastName() + " " + irinaPerson.getAge());
        // ==========================================

        // Customer Challenge class
        Customer newCustomer = new Customer("Nikola", "nikola@email.com", 4444);
        Customer chiliCustomer = new Customer(); // no arguments
        Customer oldCustomer = new Customer("Balerina", "balerina@email.com"); // name and email arguments customer

        System.out.println("Pass all arguments:" + " " + newCustomer.getName() + " " + newCustomer.getEmailAddress() + " " + newCustomer.getCreditLimit());
        System.out.println("No arguments class:" + " " +chiliCustomer.getName() + " " + chiliCustomer.getEmailAddress() + " " + chiliCustomer.getCreditLimit());
        System.out.println("Only name and email arguments:" + " " +  oldCustomer.getName() + " " + oldCustomer.getEmailAddress() + " " + oldCustomer.getCreditLimit());

        // ==========================================
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        // ==========================================

        // Student class
        for(int i = 1; i <= 5; i++) {
//            Student student = new Student("14564" + i,
//                    switch (i) {
//                case 1 -> "Nemanja";
//                case 2 -> "Irina";
//                case 3 -> "Jelena";
//                case 4 -> "Sasha";
//                case 5 -> "Anja";
//                default -> "Anonymous";
//            },
//                    "18/3/2020",
//                    "JavaMasterClass"
//                    );

            LPAStudent student = new LPAStudent("14564" + i,
                    switch (i) {
                        case 1 -> "Nemanja";
                        case 2 -> "Irina";
                        case 3 -> "Jelena";
                        case 4 -> "Sasha";
                        case 5 -> "Anja";
                        default -> "Anonymous";
                    },
                    "18/3/2020",
                    "JavaMasterClass"
            );

            System.out.println(student);
        }

        Student student = new Student("123123", "Jelena", "30/03/1996", "JavaMasterClass");
        LPAStudent lpaStudent = new LPAStudent("561233", "Filip", "30/07/2017", "JS");

        System.out.println(student.getName());
        System.out.println(lpaStudent.id()); // setter and getters within Record are methods with the same name as field. all we need is to instanceName.fieldName();
        // ==========================================

        // Wall code challenge
         Wall wall = new Wall(5,4);
        System.out.println(wall.getArea()); // 20.0
        wall.setHeight(-1.5);
        System.out.println("width: " + wall.getWidth()); // 5.0
        System.out.println("height: " + wall.getHeight()); // 0.0
        System.out.println("area: " + wall.getArea()); // 0.0
        // ==========================================

        // ComplexNumber coding challenge

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal()); // 2.0
        System.out.println("one.imaginary= " + one.getImaginary()); // 2.0
        one.subtract(number);
        System.out.println("one.real= " + one.getReal()); // - 0.5
        System.out.println("one.imaginary= " + one.getImaginary()); // 3.5
        number.subtract(one);
        System.out.println("number.real= " + number.getReal()); // 3.0
        System.out.println("number.imaginary= " + number.getImaginary()); // -5.0


        // ==========================================
        // Inheritance - Animal Class
        Animal animal = new Animal("Generic type", "big", 200);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        // ==========================================


//        int myAge = 35;
//        String yourAge = "33";
//
//        System.out.println("My age = " + myAge);
//        System.out.println("Our age = " + (myAge - Integer.parseInt(yourAge))); // parseInt is static method of the class Integer


        // The `new` keyword is used in what Java calls a Class Instance Creation Expression. ClassName variableName = new ClassName();
        int currentYear = 2025;
        // Handling exception

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi what is your name? ");
        System.out.println("Hi " + name + " Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What is your birth year? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in); // allows us to type input in console and returns back to the program



        // Validation
        System.out.println("Hi what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " Thanks for taking the course!");

        System.out.println("What is your birth year? ");
        boolean isValid = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear) + ":");

            try {
                age = checkData(currentYear, scanner.nextLine());
                isValid = age > 0;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Try again.");
                System.out.println(badUserData);
            }

        } while (!isValid);

        return "So, you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("___________");
    }
}