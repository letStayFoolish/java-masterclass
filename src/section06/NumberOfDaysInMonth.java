public class NumberOfDaysInMonth {
    /**
     * Computing Month Length With Leap Year Consideration
     * Write a method isLeapYear with a parameter of type int named year.
     * <p>
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * <p>
     * If the parameter is not in that range return false.
     * <p>
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
     * <p>
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     * <p>
     * Examples of input/output:
     * <p>
     * isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
     * <p>
     * isLeapYear(1600); → should return true since 1600 is a leap year
     * <p>
     * isLeapYear(2017); → should return false since 2017 is not a leap year
     * <p>
     * isLeapYear(2000); → should return true because 2000 is a leap year
     * <p>
     * ​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.
     * <p>
     * Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
     * <p>
     * If parameter month is < 1 or > 12 return -1. ​
     * <p>
     * If parameter year is < 1 or > 9999 then return -1.
     * <p>
     * This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
     * <p>
     * You should check if the year is a leap year using the method isLeapYear described above.
     * <p>
     * Examples of input/output:
     * <p>
     * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
     * <p>
     * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
     * <p>
     * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
     * <p>
     * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
     * <p>
     * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.
     * <p>
     * <p>
     * <p>
     * HINT: Use the switch statement.
     * <p>
     * NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.
     * <p>
     * NOTE: Do not add a main method to solution code.
     */
    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(-1666));
        System.out.println(isLeapYear(1600));
        
    }


    public static Boolean isLeapYear(int year) {
        if (1 <= year && year < 9999) {
            boolean dividedYear = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
            return dividedYear;
        } else {
            return false;
        }
    }
}
