//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int myAge = 35;
//        String yourAge = "33";
//
//        System.out.println("My age = " + myAge);
//        System.out.println("Our age = " + (myAge - Integer.parseInt(yourAge))); // parseInt is static method of the class Integer

        int currentYear = 2025;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what is your name? ");
        System.out.println("Hi " + name + " Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What is your birth year? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){
        return "";
    }
}