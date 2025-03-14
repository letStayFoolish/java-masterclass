package section06;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4)); // false
        System.out.println(canPack(1,0,5)); // true
        System.out.println(canPack(0,5,4)); // true
    }

    public static boolean canPack(int bigCount, int smallCount,int goal) {
        /**
         * The parameter bigCount represents the count of big flour bags (5 kilos each).
         *
         * The parameter smallCount represents the count of small flour bags (1 kilo each).
         *
         * The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
         */

        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        for(int i = 0; i <= bigCount * 5; i += 5) {
            if(goal == i){
                return true;
            } else {
                for(int j = 0; j <= smallCount; j++) {
                    if(goal == i + j) return true;
                }
            }
        }

        return false;
    }
}
