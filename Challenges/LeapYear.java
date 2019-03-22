public class LeapYear { 
    
      public static boolean isLeapYear(int year) {
        int x = (year % 400);
        int y = (year % 4);
        int z = (year % 100);

        if ((year < 1) && (year > 9999)) {
            return false;
        } else if ((year > 1) && (year < 9999)) {
            //Calculate if its a leap year and return true
            if (x == 0) {
                return true;
            } else if ((y == 0) && (z != 0)) {
                return true;
            }

        }
        return false;
    }

}
