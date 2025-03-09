package section06;

public class FactorPrinter {
    public static void main(String[] args) {
       printFactors(6); // 1 2 3 6
    }

    public static void printFactors(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int divider = 1;
        while(divider <= number) {
            if(number % divider == 0) {
                System.out.println(divider);
            }
            divider++;
        }
    }
}
