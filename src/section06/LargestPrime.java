package section06;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // should return 7 since 7 is largest prime number (7 * 3 = 21);
        System.out.println(getLargestPrime(217)); // should return 31 since 31 is the largest prime number (7 * 31 = 217);
        System.out.println(getLargestPrime(7)); // should return 7;
        System.out.println(getLargestPrime(45)); // should return 5;
    }

    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;

        int largestPrimeFactor = 0;

        // Start with the smallest prime factor
        for(int i = 2; i <= number; i++) {
            // check if 'i' is a factor of 'number'
            while(number % i == 0) {
                largestPrimeFactor = i;

                number /= i; // Reduce the number
            }
        }

        return largestPrimeFactor;
    }
}
