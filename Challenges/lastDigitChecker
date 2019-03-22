public class LastDigitChecker {
   public static boolean hasSameLastDigit (int x, int y, int z){
	        if ((x < 10 || x > 1000) ||(y < 10 || y > 1000) || (z < 10 || z > 1000)) { 
	            return false;
	    } else { 
	    	int i = 1000;
	    	while (i >= 10) {
	        int xRightMost = (x % 10); 
	        int yRightMost = (y % 10); 
	        int zRightMost = (z % 10); 
	        if ((xRightMost == yRightMost || xRightMost == zRightMost || zRightMost == yRightMost) 
	        		|| (xRightMost == zRightMost && xRightMost == yRightMost) ){
	            return true;
	        }
	        i = i / 10;
	        
	        }
	    	return false;
	    }
} 
	 public static boolean isValid (int x) {
		 if ( x < 10 ||  x > 1000) {
			 return false; 
		 } else {
				 return true;
			 }
			 
		 }
        
}
