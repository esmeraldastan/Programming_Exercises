
/**
 * Write a description of class SumCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumCount{
    public static int SumCount(int  n){
        if ( n == 0){
            return 0;
        }
        else{
            return (n%10 + SumCount(n/10));
        }
    }
   
}
