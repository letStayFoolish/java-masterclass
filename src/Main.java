public class Main {
    // psvm shortcut
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is my first Java program!");

        // Expressions
        double kilograms = 75.6; //

        // Statements
        // Declaration statement
        int myAge = 34; // single-value (each statement on a single line);
        // Assignment statement
        myAge = 66;

        // ...
        // Chili is argument
        calcMyScore("Chili");
        calcMyScore("Irina");

        String nameResult = playWithGivenNames("Jelena", "Sasha", "Irina", "Nemanja");
        System.out.println(nameResult);
    };

    // name is parameter
    public static void calcMyScore(String name) {
        int myScore = (int) Math.floor(Math.random() * 799);

        boolean isGameOver = false;

        if (myScore == 0) {
            System.out.println(name + ", Your score is zero");
            isGameOver = true;
        } else if (myScore < 500) {
            System.out.println(name + ", You lose.");
            isGameOver = true;
        } else {
            System.out.println(name + ", You win!");
            isGameOver = true;
        }
    }

    public static String playWithGivenNames(String name1, String name2, String name3, String name4) {
        String[] namesArray = {name1, name2, name3, name4};
        String concatenatedChars = concatenateFirstCharacters(namesArray);

        return concatenatedChars.toUpperCase();
    }

    public static String concatenateFirstCharacters(String[] namesArray) {
        StringBuilder resultBuilder = new StringBuilder();

        for(String name : namesArray) {
            int index = (int) Math.floor(Math.random() * name.length());

            resultBuilder.append(name.charAt(index));
        }

        return resultBuilder.toString();
    }
}
