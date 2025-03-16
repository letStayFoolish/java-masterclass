package section06;

import java.util.Scanner;

public class EnteredMinAndMaxChallenge {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int trackMaxNumber = 0;
        int trackMinNumber = 0;
        int currentNumber = 0;

        do {
            System.out.println("Please enter a number");

            String str = input.nextLine();
            try {
                currentNumber = Integer.parseInt(str);

                if(currentNumber > trackMaxNumber) {
                    trackMaxNumber = currentNumber;
                }

                if(currentNumber < trackMinNumber) {
                    trackMinNumber = currentNumber;
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid number");
                break;
            }
        } while (true);

        System.out.println("Minimum number entered is: " + trackMinNumber + " and the maximum number entered is: " + trackMaxNumber + ".");
    }
}
