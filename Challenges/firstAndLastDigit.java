public class FirstLastDigitSum {
 public static int sumFirstAndLastDigit ( int number ) { 
             int x = 0; 
             int lastDigit = number % 10;
             
        if (number < 0) { 
            return -1; 
        } else if (number == 0 || number < 10) {
            return number * 2;
            } else { 
            while (number > 0) {  
             x = number / 10;
     System.out.println(lastDigit + " this is the last digit!");
     if (x < 10 && x > 0) {
         System.out.println(x + " here!");
         return x + lastDigit;
     }
               number = number / 10; 
        
            }
        return number;
    }
} 
}
