package section06;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(25732));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(11));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastNumber = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int startNumber = number;

        return startNumber + lastNumber;
    }
}
