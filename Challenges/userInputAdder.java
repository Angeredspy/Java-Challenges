import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);  
		int counter = 0; 
		int sum = 0;
		
		while(true) {
			int order = counter + 1; 
			System.out.println("Enter number " + order + ":");
			
			boolean isInt = keyboard.hasNextInt(); 
			
			if (isInt) { 
				int number = keyboard.nextInt(); 
				counter++;
				sum += number; 
				if (counter == 10) {
					break;
				}
				
			} else { 
				System.out.println("Invalid Integer Entry");
			} 
			keyboard.nextLine(); //Handle nextLine int errors
		} 
		System.out.println("Sum = " + sum);
		keyboard.close();
		
	} 
