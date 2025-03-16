package section06;

import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;

//        while(counter <=5) {
//            System.out.println("Enter number #" + counter + ": ");
//
//            String enteredNumber = (input.nextLine());
//            try {
//                int num = Integer.parseInt(enteredNumber);
//                System.out.println("Entered number is valid, and it is: " + num);
//                counter++;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid number");
//                System.out.println(e);
//            }
//        }
        do {
            System.out.println("Enter number #" + counter + ": ");

            String enteredNumber = (input.nextLine());
            try {
                int num = Integer.parseInt(enteredNumber);
                System.out.println("Entered number is valid, and it is: " + num);
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
                System.out.println(e);
            }
        } while (counter <=5);
    }
}
