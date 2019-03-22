public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int h =(int) minutes / 60;
            int d = h / 24;
            int y = d / 365;
            long remainderD = d % 365;

            System.out.println(minutes + " min = " + y +  " y and " + remainderD + " d");
        }
    }
}
