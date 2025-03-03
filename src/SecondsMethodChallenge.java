public class SecondsMethodChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(37680));
        System.out.println(getDurationString(-55));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        // 1h = 60m,
        // 1m = 60s
        // 1h = 60 * 60 = 3600s
        if (seconds < 0) {
            return ("Seconds value must be positive value!");
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return ("Minutes value must be positive value!");
        }

        if (seconds < 0 || seconds > 59) {
            return ("Seconds must be between values 0 and 59!");
        }

        int hours = minutes / 60 + seconds / 3600;

        int remainingMinutes = minutes % 60;
        
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    ;
}
