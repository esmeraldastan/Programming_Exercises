
/**
 * Write a description of class decToBin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class binToDec{
   public static int binToDec(String binaryString){
       int length = binaryString.length();
       if (length == 1){
           return Integer.parseInt(binaryString);
        }
        else{
            return binToDec(binaryString.substring(1,length)) +Integer.parseInt(binaryString.substring(0,1)) * (int) Math.pow(2, length-1);
       
    }
  }
}
