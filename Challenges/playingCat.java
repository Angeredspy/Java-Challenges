public class PlayingCat {
public static boolean isCatPlaying (boolean summer, int temperature) { 
    if (summer == true) {
         if ((temperature < 25) || (temperature > 45)) {
        return false;
    }  else {
    return true; 
    }
    }
    if ((temperature < 25) || (temperature > 35)) {
        return false;
    } 
    return true;
}  
} 
