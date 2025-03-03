public class MethodsChallenge {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int firstScore = calculateHighScorePosition(1500);
        int secondScore = calculateHighScorePosition(1000);
        int thirdScore = calculateHighScorePosition(500);
        int forthScore = calculateHighScorePosition(100);
        int fifth = calculateHighScorePosition(25);

        displayHighScorePosition("Tim", firstScore);
        displayHighScorePosition("Irina", secondScore);
        displayHighScorePosition("Nemanja", thirdScore);
        displayHighScorePosition("Sasha", forthScore);
        displayHighScorePosition("Anja", fifth);
    }

    // First method
    public static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " managed to get into position " + highScore + " on the high score list.");
    }

    // Second method:
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
