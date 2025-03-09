package section06;

public class LastDigitChecker {
    public static void main(String[] args) {
//        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(10, 10, 10)); // true
//        System.out.println(hasSameLastDigit(9, 99, 999)); // false
    }

    public static boolean hasSameLastDigit(int numberX, int numberY, int numberZ){
        if(!isValid(numberX) || !isValid(numberY) || !isValid(numberZ)) return false;

        int digitX = numberX % 10;
        int digitY = numberY % 10;
        int digitZ = numberZ % 10;

        return digitX == digitY || digitX == digitZ || digitY == digitZ;
    }

    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;
    }
}
