
/**
 * Write a description of class Count here.
 * 
 * @author Esmeralda 
 * @version 4.06.17
 */
public class Count{
    public static int count(String str, char x){
        int count = 0;
        for ( int i = 0; i< str.length(); i++){
            if ( str.charAt(i) == x){
           count++;
        }
        
    }
    return count;
}
}
