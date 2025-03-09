package section06;

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23)); // should return true (2 is within both numberX and numberY);
        System.out.println(hasSharedDigit(9, 99)); // should return false;
    }


    public static boolean hasSharedDigit(int numberX, int numberY) {
        if(numberX < 10 || numberX > 99 || numberY < 10 || numberY > 99) {
            return false;
        }


        while(numberX > 0){
            int digitX = numberX % 10;

            int temporaryY = numberY;
            while(temporaryY > 0) {
                int digitY = temporaryY % 10;

                if(digitX == digitY) {
                    return true;
                }

                temporaryY /= 10;
            }

            numberX /= 10;
        }
        return false;
    }
}
