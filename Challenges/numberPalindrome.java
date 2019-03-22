 public class NumberPalindrome 
    {
    public static boolean isPalindrome (int number) {
        if (number<0)
            number *= -1;
 
        int reverse =0;
        int numberHolder = number;
 
        while (numberHolder >0) {
            int lastDigit= numberHolder % 10 ;
            numberHolder /= 10;
            reverse *=10;
            reverse = reverse+lastDigit;
        }
 
        if (number == reverse)
            return true;
        else
            return false;
 
    }
}
