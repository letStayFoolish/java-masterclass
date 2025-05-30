package section09;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main (String... args) {
        int capacity = readInteger();

        int[] arr = readElements(capacity);

        findMin(arr);
    }

    private static int readInteger() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an a number that defines how many elements you want to put in your array.");

        return input.nextInt();
    };

    private static int[] readElements(int capacity) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[capacity];

        System.out.println("Enter " + capacity + " integers.");
        for (int i = 0; i < capacity; i++) {
            arr[i] = input.nextInt();
        };

        return arr;
    };

    private static int findMin(int[] numbers) {
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(copyOfNumbers);
        int minValue = copyOfNumbers[0];
        System.out.println("Minimum value is: " + minValue);
        return minValue;
    };
}
