package section09;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArr = getRandomArrDescendingOrder(7);
        System.out.println("Before sorting: " + Arrays.toString(unsortedArr));

        int[] sortedArr = Arrays.copyOf(unsortedArr, unsortedArr.length);
        Arrays.sort(sortedArr);
        System.out.println("After sorting: " + Arrays.toString(sortedArr));
    }

    public static int[] getRandomArrDescendingOrder(int length) {
        Random randomInt = new Random();

        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = randomInt.nextInt(100);
        };

        return arr;
    };

    public static int[] sortArr(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        return sortedArr;
    }
}
