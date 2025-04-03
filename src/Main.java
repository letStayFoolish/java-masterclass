import secion07.*;
import section08.*;

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
//        System.out.println("Make: " + car.getMake());

//        System.out.println("Model: " + car.getModel());
//        System.out.println("Color: " + car.getColor ());
        car.setMake("Honda");
        car.setMake("Audi");

//        System.out.println("Make: " + car.getMake());
        // ==========================================

        // Person class
        Person newPerson = new Person("Nemanja");
        Person irinaPerson = new Person("Karaklajic", 32);
//        System.out.println(newPerson.getFirstName());
//        System.out.println(irinaPerson.getLastName() + " " + irinaPerson.getAge());
        // ==========================================

        // Customer Challenge class
        Customer newCustomer = new Customer("Nikola", "nikola@email.com", 4444);
        Customer chiliCustomer = new Customer(); // no arguments
        Customer oldCustomer = new Customer("Balerina", "balerina@email.com"); // name and email arguments customer

//        System.out.println("Pass all arguments:" + " " + newCustomer.getName() + " " + newCustomer.getEmailAddress() + " " + newCustomer.getCreditLimit());
//        System.out.println("No arguments class:" + " " +chiliCustomer.getName() + " " + chiliCustomer.getEmailAddress() + " " + chiliCustomer.getCreditLimit());
//        System.out.println("Only name and email arguments:" + " " +  oldCustomer.getName() + " " + oldCustomer.getEmailAddress() + " " + oldCustomer.getCreditLimit());

        // ==========================================
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
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

//            System.out.println(student);
        }

        Student student = new Student("123123", "Jelena", "30/03/1996", "JavaMasterClass");
        LPAStudent lpaStudent = new LPAStudent("561233", "Filip", "30/07/2017", "JS");

//        System.out.println(student.getName());
//        System.out.println(lpaStudent.id()); // setter and getters within Record are methods with the same name as field. all we need is to instanceName.fieldName();
        // ==========================================

        // Wall code challenge
//         Wall wall = new Wall(5,4);
//        System.out.println(wall.getArea()); // 20.0
//        wall.setHeight(-1.5);
//        System.out.println("width: " + wall.getWidth()); // 5.0
//        System.out.println("height: " + wall.getHeight()); // 0.0
//        System.out.println("area: " + wall.getArea()); // 0.0
        // ==========================================

        // ComplexNumber coding challenge

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
//        System.out.println("one.real= " + one.getReal()); // 2.0
//        System.out.println("one.imaginary= " + one.getImaginary()); // 2.0
        one.subtract(number);
//        System.out.println("one.real= " + one.getReal()); // - 0.5
//        System.out.println("one.imaginary= " + one.getImaginary()); // 3.5
        number.subtract(one);
//        System.out.println("number.real= " + number.getReal()); // 3.0
//        System.out.println("number.imaginary= " + number.getImaginary()); // -5.0

        // ==========================================
        // Inheritance - Animal Class
        Animal animal = new Animal("Generic type", "big", 200);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        yorkie.toString();

        Fish fish = new Fish("Skusha", 160, 4, 10);
        doAnimalStuff(fish, "fast");
        // ==========================================

        // Inheritance Code Challenge
        Worker worker = new Worker("Chili", "30.11.1990");
//        System.out.println(worker);

        Employee irina = new Employee("IrinaG", "21.10.1994", "21.03.2025");
        Employee nemanja = new Employee("Nemanja", "21.10.1994", "21.03.2025");
//        System.out.println(irina);
//        System.out.println(irina.getAge());
//        System.out.println(irina.collectPay());
//        System.out.println(nemanja);

        SalariedEmployee joe = new SalariedEmployee("Joe", "25.06.1888", "16.10.2021", 35000);
        joe.retire();
//        System.out.println("Joe pay check: $" + joe.collectPay());

        // ==========================================

        // Inheritance and chaining constructors

        Rectangle myRec = new Rectangle(0, 0, 12, 25);
//        System.out.println(myRec);
        // ==========================================

        // Inheritance and chaining constructors
        int yourAge = 35;
        float yourWeight = 75.555f;

//        System.out.printf("Your age is %d\n", yourAge);
//        System.out.printf("Your weight is %.2f\n", (float) yourWeight);

        String formatedString = String.format("Formated string: your age is %d", yourAge);
//        System.out.println(formatedString);
        // ==========================================

        // String methods
        /**
         * length() -> returns the number of characters in the String;
         * charAt() -> returns the character at the index that's passed;
         * indexOf(), lastIndexOf() -> returns an integer, to locate passed char in the String;
         * isEmpty() -> returns true if length is zero;
         * isBlank() -> returns true if length is zero OR the string contains only whitespace characters.
         */

//        String helloWorld = "Hello World!";
//        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
//        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
//        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l'));

        String myBirthDate = "30.11.1990";
        int startingIndex = myBirthDate.indexOf("1990");
        System.out.println("Starting index: " + startingIndex);
        System.out.println("Year: " + myBirthDate.substring(startingIndex));
        // Substring month from full date:
        System.out.println("Month: " + myBirthDate.substring(3,5));
        System.out.println("Join string: " + String.join(".", "22", "10", "1999"));
        System.out.println("Replace: " + myBirthDate.replace('.', '/'));

        String helloWorld = "Hello" +" World!";
        helloWorld.concat(" And goodbye!");
        String helloWorld2 = helloWorld.concat(" And goodbye!");

        StringBuilder stringBuilder = new StringBuilder("Hello" + " World!");
        stringBuilder.append(" And goodbye!");
        // StringBuilders are mutable and Strings are not!
        printInformation(helloWorld);
        printInformation(helloWorld2);
        printInformation(stringBuilder);
        // ==========================================

        // Circle, Cylinder Coding challenge
        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
        // ==========================================

        // Cuboid Pool Area Calculation Coding challenge
        RectangleSwim rectangle = new RectangleSwim(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        // ==========================================

        // Product - Personal computer Inheritance vs Composition
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Dimensions dimensions = new Dimensions(4, 6, 5);
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4, 6, "v2.44", dimensions);
        PersonalComputer chiliPC = new PersonalComputer("2208", "Dell", theMotherboard, theMonitor, theCase);

        // Inheritance
//        chiliPC.getMonitor().drawPixelAt(10, 10, "green");
//        chiliPC.getComputerCase().pressPowerButton();
//        chiliPC.getMotherboard().loadProgram("MacOS");

        // Composition
        chiliPC.powerUp();

        // ==========================================

        // Smart Kitchen codding challenge
        SmartKitchen kitchen1 = new SmartKitchen();

        // Try to use Composition over Inheritance, or look for Composition over Inheritance first!!!

//        kitchen1.getCoffeeMaker().setHasWorkToDo(true);
//        kitchen1.getDishWasher().setHasWorkToDo(true);
//        kitchen1.getIceBox().setHasWorkToDo(true);
//
//        kitchen1.getCoffeeMaker().brewCoffee();
//        kitchen1.getDishWasher().doDishes();
//        kitchen1.getIceBox().orderFood();
        kitchen1.setKitchenState(true,false,true);
        kitchen1.doKitchenWork();

        // ==========================================
        // Bedroom Composition Exercise: Creating Classes for Lamp, Bed, and Wall

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

        // ==========================================
        // Encapsulation
        // In Java, encapsulation means hiding things by making them private or inaccessible.
        Player chili = new Player("Chili");
        chili.getHealth(10);
        System.out.println(chili.healthRemaining());
        // ==========================================
        // Printer - Encapsulation example

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        // ==========================================
        // Polymorphism
        //Movie theMovie = new Movie("Star Wars");
//        Movie theMovie = new AdventureMovie("Star Wars");
//        theMovie.watchMovie();
//Movie theMovie = Movie.getMovie("AdventureMovie", "Indiana Jones");
//Movie maybeComedy = Movie.getMovie("Comedy", "Jackie Chan");
//Movie sfMovie = Movie.getMovie("Science", "Star Wars");
//        maybeComedy.watchMovie();
//        sfMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();

            if("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter movie name: ");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);

            movie.watchMovie();
            return;
        }

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
//            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
//            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi what is your name? ");
//        System.out.println("Hi " + name + " Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What is your birth year? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in); // allows us to type input in console and returns back to the program



        // Validation
//        System.out.println("Hi what is your name?");
        String name = scanner.nextLine();
//        System.out.println("Hi " + name + " Thanks for taking the course!");

//        System.out.println("What is your birth year? ");
        boolean isValid = false;
        int age = 0;

        do {
//            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear) + ":");

            try {
                age = checkData(currentYear, scanner.nextLine());
                isValid = age > 0;
            } catch (NumberFormatException badUserData) {
//                System.out.println("Characters are not allowed! Try again.");
//                System.out.println(badUserData);
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
//        System.out.println(animal);
//        System.out.println("___________");
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder stringBuilder) {
        System.out.println("String builder = " + stringBuilder);
        System.out.println("Length of string builder = " + stringBuilder.length());
    }
}