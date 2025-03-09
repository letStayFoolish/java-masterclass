package section06;

public class SumDigits {
    public static void main(String[] args) {

        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-1554));
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1; // invalid number is passed

        String numberStr = Integer.toString(number);

        int sum = 0;

        // ['1', '2', '3', '4',..]
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);

            sum += digit;
        }
        
        return sum;
    }
}
