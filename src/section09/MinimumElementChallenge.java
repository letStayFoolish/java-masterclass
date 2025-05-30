package section09;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String... args) {
        int[] arr = readIntegers();
        findMin(arr);
    }

    private static int[] readIntegers() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter as many integers as you like.");
        String[] intList = input.nextLine().split(","); // method split splits a String and gives us an array of String.

        int[] numbers = new int[intList.length];
        for(int i = 0; i < intList.length; i++) {
            numbers[i] = Integer.parseInt(intList[i].trim()); // trim any spaces before any passing
        };

        System.out.println("Enter numbers separated by commas: " + Arrays.toString(numbers));
        return numbers;
    }

    private static int findMin(int... arr) {
        int[] copyArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArray);

        int minValue = copyArray[0];
        // Print minimum value
        System.out.println("=".repeat(20));
        System.out.println("Minimum value is: " + minValue);
        // Return minimum value
        return minValue;
    };
}
