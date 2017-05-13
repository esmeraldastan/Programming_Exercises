
/**
 * Write a description of class stringReverse here.
 * 
 * @author Esmeralda Lopez
 * @version 5.11.17    
 */
 public class stringReverse{
    public String reverseDisplay(String x){
    if (x.length() == 0){
        return x;
    }else{
      return reverseDisplay(x.substring(1)) + x.charAt(0);
   }
 }
}
