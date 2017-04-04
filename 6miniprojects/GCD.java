
/**
 * Write a description of class GCD here.
 * 
 * @author Esmeralda Lopez
 * @version 4.04.17
 */
public class GCD{
    public static int GCD( int a, int b){
        if ( b % a == 0){
            return a;
        }else{
            return GCD( b, a%b);
        }
        }
    }
            
    
   
