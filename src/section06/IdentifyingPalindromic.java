package section06;

public class IdentifyingPalindromic {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
    }

    static public boolean isPalindrome(int number) {
        int originalNumber = number;
        number = Math.abs(number);

        int reversed = 0;
        int lastDigit = 0;

        while (number > 0) {
            // Extract the last digit
            lastDigit = number % 10;

            // Add it to the reversed number after increasing place value
            reversed = reversed * 10 + lastDigit;

            // Remove the last digit from the original number
            number = number / 10;
        }

        return Math.abs(originalNumber) == reversed;
    }
}
