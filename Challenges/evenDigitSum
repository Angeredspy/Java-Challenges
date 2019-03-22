public class EvenDigitSum {

     public static int getEvenDigitSum (int number) {  
    
    int newSum = 0;
    if (number < 0) { 
        return -1; 
    } else {  
        while (number  > 0) { 
             int lastDigit = number % 10;
        if (lastDigit % 2 == 0) { 
            newSum += lastDigit; 
        } 
       number /= 10;
        }
    }  
    return newSum;
} 
}
        

