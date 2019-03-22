public class SharedDigit {
   public static boolean hasSharedDigit (int x, int y) { 
		int digX = 0; 
		int digY = 0; 
		int digY2 = 0; 
		int digY2Thing = 0; 
		int digX2 = 0;
		int digX2Thing = 0;
		if ((x < 10 || x > 99) || (y < 10 || y > 99) ) { 
			return false;
		} else {  
			digX = x % 10;  
			digX2 = x / 10; 
			digX2Thing = digX2 % 10;
			digY = y % 10;   
			digY2 = y / 10; 
			digY2Thing = digY2 % 10;
			
			
			if ((digX == digY || digX == digY2Thing) || (digY == digX2Thing || digX2Thing == digY2Thing ) ) { 
				return true; 
			} else {
				return false;
			
			
		}
	}
	} 
}
