package section06;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15)); // return 5
        System.out.println(getGreatestCommonDivisor(30, 12)); // return 6
        System.out.println(getGreatestCommonDivisor(18, 9)); // return -1
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) return -1;

        int counter = 1;
        int divider = 0;
        while(counter < first) {
            if(first % counter == 0 && second % counter == 0) {
                    divider = counter;
            }
            counter++;
        }
        return divider;
    }
}
