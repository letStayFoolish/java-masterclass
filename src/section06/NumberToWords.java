package section06;

public class NumberToWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(0)); // should return 1 since there is only 1 digit
//
//        System.out.println(getDigitCount(123)); //should return 3
//
//        System.out.println(getDigitCount(-12)); // should return -1 since the parameter is negative
//
//        System.out.println(getDigitCount(5200)); // should return 4
//
//        System.out.println(reverse(-121)); // should  return -121
//
//        System.out.println(reverse(1212)); // should return  2121
//
//        System.out.println(reverse(1234)); // should return 4321
//
//        System.out.println(reverse(100)); // should return 1

//        numberToWords(123); // should print "One Two Three".

        numberToWords(0); // should print "Zero".

        numberToWords(1010); // should print "One Zero One Zero".

        numberToWords(1000); // should print "One Zero Zero Zero".

        numberToWords(-12); // should print "Invalid Value" since the parameter is negative.
    }

    /**
     * Write a method called numberToWords with one int parameter named number.
     *
     * The method should print out the passed number using words for the digits.
     *
     * If the number is negative, print "Invalid Value".
     *
     * To print the number as words, follow these steps:
     *
     * Extract the last digit of the given number using the remainder operator.
     *
     * Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
     *
     * Remove the last digit from the number.
     *
     * Repeat Steps 2 through 4 until the number is 0.
     *
     * The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
     *
     * The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
     *
     * Use the method reverse within the method numberToWords in order to print the words in the correct order.
     *
     * Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
     *
     * The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
     * For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
     */
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value"); // Handle negative numbers
            return;
        }

        if(number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        // 4. Repeat Steps 2 through 4 until the number is 0.
        while(reversedNumber > 0){
            // 1. Extract the last digit of the given number using the remainder operator
            int lastDigit = reversedNumber % 10; // Extract the last digit

            // 2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit,
            // those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit,
            // e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
             switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("");
            };

            // 3. Remove the last digit from the number.
            reversedNumber /= 10;
        }

        for(int i = 0; i < (originalDigitCount - reversedDigitCount); i++){
            System.out.print("Zero ");
        }
    }

    public static String convertDigitToWord(int digit) {
        return switch (digit) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }

    public static int getDigitCount(int number) {
        if(number < 0){
            return -1;
        };

        if (number == 0) {
            return 1;
        }

        int count = 0; // Initialize digit counter

        while(number > 0) {
            count++;
            number /= 10; // Reduce the number by stripping the last digit
        }

        return count;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while(number != 0) {
            int lastDigit = number % 10; // Extract the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // Build the reversed number

            number /= 10; // Remove the last digit
        }

        return reversedNumber; // Negative sign is automatically preserved
    }
}
