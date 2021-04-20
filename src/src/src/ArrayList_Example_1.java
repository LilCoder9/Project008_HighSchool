package src.src;

/**
 *Introduction to ArrayList
 * 
 */
import java.util.*;

public class ArrayList_Example_1
{
    
	public static void main(String[] args)
    {
       ArrayList<Double> b;
       b= new ArrayList<Double>();
       
      
       b.add( 0, new Double(1.0) );
       b.add( 1, new Double(-3.1) );
       b.add( 2, new Double(6.3) );
       b.add( new Double(7.0) );
       
       
       int i;
       for( i =0; i < b.size(); i++)
       {
           System.out.printf(" %d %f\n", i, b.get(i).doubleValue());
        }
        
        doubleArray(b);
        printArray(b);
        
       ArrayList<Double> c;
       c = doubleArray2(b);
       printArray(c);
    }
    
    public static void printArray( ArrayList<Double> w )
    {
        int i;
        
        for( i =0; i < w.size(); i++)
       {
           System.out.printf(" %d %f\n", i, w.get(i));
        }
    }
    
    public static void doubleArray( ArrayList<Double> p)
    {
        int i;
        
        for( i=0; i < p.size(); i++)
        {
           p.set(i, new Double(p.get(i).doubleValue() * 2) );
        }
    }
    
    public static ArrayList<Double> doubleArray2(ArrayList<Double> y)
    {
        ArrayList<Double> result = new ArrayList<Double>();
        int i;
        
        for(i=0; i < y.size(); i++)
           result.add(i , new Double (y.get(i).doubleValue()*2));
            
        return result;
    }
}
