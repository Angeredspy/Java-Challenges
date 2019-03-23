import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);  

		int counter = 0; 
		int min = 0; 
		int max = 0; 
		int number = 0; 
		boolean first = true;
		while (true) { 
			counter++;
			System.out.println("Please enter a number");  
			boolean isInt = keyboard.hasNextInt(); 
			
			
			if (isInt) { 
				number = keyboard.nextInt();
				
				if (first) {
					first = false; 
					min = number; 
					max = number;
				} else if (number > max) { 
					max = number;
				} else if (number < min) { 
					min = number; 
				} else if (counter == 10){ 
					break;
				}
			
				
				
			} else {
				break;
			}
			keyboard.nextLine();
			
		} 
		System.out.println("Min is " + min + " Max is " + max);
	} 
	
