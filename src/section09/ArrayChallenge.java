package section09;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArr = getRandomArrDescendingOrder(7);
        System.out.println("Before sorting: " + Arrays.toString(unsortedArr));

        int[] sortedArr = getArrSorted(unsortedArr);

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

    public static int[] getArrSorted(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        for(int i = 0; i < arrCopy.length; i++){
            for(int j = i; j < arrCopy.length; j++){
                if(arrCopy[i] < arrCopy[j]) {
                    int temp = arrCopy[i];
                    arrCopy[i] = arrCopy[j];
                    arrCopy[j] = temp;
                }
            }
        }

        return arrCopy;
    }
}
