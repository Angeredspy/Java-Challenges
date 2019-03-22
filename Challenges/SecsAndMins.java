public static String getDurationString(int minutes, int seconds) { 
		if (minutes < 0 || seconds < 0 || seconds > 59) { 
			return "Invalid Value";
		} else { 
			int XX = minutes / 60; // Hours = # of minutes / 60 
			int YY = minutes % 60; // Minutes left = $ mins mod 60
			int ZZ = seconds; 	   // Seconds = seconds
			return (XX + "h" + YY + "m" + ZZ + "s");
		}
	}  
	
	public static String getDurationString(int seconds) { 
		if (seconds < 0) {
			return "Invalid Value";
		} else { 
			int minutes = (seconds / 60); // Minutes = seconds / 60 
			int secondsRemaining = (seconds % 60); // Secs left = seconds mod secs
			return (getDurationString(minutes, secondsRemaining));

			
		}
	}
