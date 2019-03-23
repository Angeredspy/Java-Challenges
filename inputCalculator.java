import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner keyboard = new Scanner(System.in); 
        int XX = 0; 
		long YY = 0; 
		int sum = 0; 
		double counter = 1.0;

		
		while(true) { 
			boolean isInt = keyboard.hasNextInt(); 
			if (isInt) {
				XX = keyboard.nextInt(); 
				sum += XX;
				YY = Math.round((sum / counter)); 
				counter++;
				
			} else {
				
				break;
			}
			keyboard.nextLine();
		}
		System.out.println("SUM = " + sum + " AVG = " + YY);
		keyboard.close();
	} 
}
