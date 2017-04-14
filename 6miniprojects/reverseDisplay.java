
/**
 * Write a description of class reverseDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reverseDisplay{
    public int reverseDisplay(int value){
    
        if (value <=10 ){
			return value;
		}
		else{
			return Integer.parseInt("" + (value%10) + reverseDisplay(value/10));
		}
		}
}
