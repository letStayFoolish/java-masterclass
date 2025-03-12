package section06;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(6)); // returns true
    }

    /**
     * What is the perfect number?
     * A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
     * Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
     * For example, take the number 6:
     * Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
     *
     * Therefore, 6 is a perfect number (as well as the first perfect number).
     */

    public static boolean isPerfectNumber(int number) {
        if(number <= 0) return false;

        int counter = 1;
        int sum = 0;

        while(counter < number) {
           if(number % counter == 0) {
                sum += counter;
            }
           counter++;
        }

        return sum == number;
    }
}
