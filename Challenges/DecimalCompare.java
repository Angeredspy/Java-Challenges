public class DecimalComparator{
 
public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double c = 1000 * a;
        double d = 1000 * b;
        int i = (int) c;
        int j = (int) d;
        if (i==j) {
            return true;}
 
            return false;
 
    }
} 
