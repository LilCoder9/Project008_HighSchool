package src.src;


/**
 * class IncreaseDigits - using ArrayLists
 * 
 */
import java.util.*;

public class IncreaseDigits
{
    public static void main(String[] args)
    {
        ArrayList x = new ArrayList<Integer>();    // Array filled with first 11 digits of Pi.
        ArrayList y; 
        
        double p = Math.PI;
        for(int i=0; i < 11; i++)
        {
            x.add( (int) p );
            p = p - (int)p;
            p *= 10;   
        }
        
        System.out.println("Original Array:");
        display(x);

        // Part (a)
        System.out.println("Part (a): using increaseDigits1");
        increaseDigits1( x );
        display(x);

        // part (b)
        System.out.println("Part (b): using increaseDigits2");
        y = increaseDigits2( x );
        display( y );
   }
   
   private static void display( ArrayList<Integer> x )
   {
       int i;
       
       System.out.print("Array: ");
       for(i=0; i < x.size(); i++)
       {
           if( i < x.size()-1 )
                System.out.printf("%3d, ", x.get(i));
           else
                System.out.printf("%3d\n", x.get(i));
       }
    }
  
    private static int nextDigit(int n)
    { 
        if( n == 9)
        {
        return 0;
       }
        return n+1;
        
    }
    
    public static void increaseDigits1 (ArrayList<Integer> b)
   {
       int i;
       for(i=0; i< b.size();i++)
     {
         b.set(i,nextDigit(b.get(i)));
    }
   }
    
    public static ArrayList<Integer> increaseDigits2 (ArrayList<Integer> y)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i;
        
        for(i=0; i<y.size();i++)
        {
            result.add(i,nextDigit(y.get(i)));
        }
        return result;
    }
    
}
