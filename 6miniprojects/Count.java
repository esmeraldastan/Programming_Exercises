
/**
 * Write a description of class Count here.
 * 
 * @author Esmeralda 
 * @version 4.06.17
 */
public class Count{
    public static int count(String str, char x){
        if ( str.length() == 0){
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == x){
            count ++;
        }
        return count + count(str.substring(1),x);
    }
}