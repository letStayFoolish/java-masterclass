package section09;

import java.util.Arrays;
import java.util.Random;

public class NestedArray {
    public static void main (String[] args) {
        // Nested array
        int[][]arr = new int[4][3];

        for (var outer : arr) {
            for (var element : outer) {
                Random random = new Random();
                element = random.nextInt(100);
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("Original array: " + Arrays.deepToString(arr));
    }
}
