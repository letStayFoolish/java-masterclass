package section06;

import java.util.Scanner;

public class InputCalculator {
    public static void main (String[] args){
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        int sum = 0;
        int count = 0;
        long avg = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter a number: ");

            try {
                sum += Integer.parseInt(scanner.nextLine());
                count ++;

            } catch (NumberFormatException e) {
                break;
            }
        } while (true);

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
