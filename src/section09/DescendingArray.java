package section09;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingArray {
    public static void main(String[] args) {
        int[] myArr = getIntegers(4);
        int[] sortedArr = sortIntegers(myArr);
        printArray(sortedArr);
    }

    public static int[] getIntegers(int length) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[length];
        System.out.println("Enter " + length + " integer values:\r");
        for(int i = 0; i < arr.length; i++) {
          arr[i] = input.nextInt();
        }

        return arr;
    };

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element "+ i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArr){
        int[] arrCopy = Arrays.copyOf(unsortedArr, unsortedArr.length);

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
    };

    /**
     *    public static int[] sortIntegers(int[] array) {
     *
     *         int[] sortedArray = Arrays.copyOf(array, array.length);
     *         boolean flag = true;
     *         int temp;
     *         while (flag) {
     *             flag = false;
     *             for (int i=0; i<sortedArray.length-1; i++) {
     *                 if (sortedArray[i] < sortedArray[i+1]) {
     *                     temp = sortedArray[i];                     // 1
     *                     sortedArray[i] = sortedArray[i+1];         // 2
     *                     sortedArray[i+1] = temp;                   // 3
     *                     flag = true;                               // 4
     *                 }
     *             }
     *         }
     *         return sortedArray;
     *     }
     */
}
