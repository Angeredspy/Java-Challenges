	 public static long toMilesPerHour (double kilometersPerHour){ 
	     if (kilometersPerHour < 0){ 
	         return -1; 
	         } else if (kilometersPerHour > 0){ 
	             double mph = 1.609;
	             double numToRound = kilometersPerHour / mph;
	             long rounded = Math.round(numToRound); 
	             return rounded;
	         } else { 
	             return -1; 
	         }
	         
	}  
	public static void printConversion (double kilometersPerHour) { 
	 if (kilometersPerHour < 0){ 
	     System.out.println("Invalid Value"); 
	 } else if (kilometersPerHour > 0) { 
	     System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) + " mi/h");
	 } else if (kilometersPerHour == 0.0) { 
		 System.out.println(kilometersPerHour + " km/h = 0.0 mi/h");
	 }
	 
	 
	} 
