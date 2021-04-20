package src.src;


/**
 * class CycleElements - using built-in arrays
 * 
 */
import java.util.*;

public class CycleElements
{
    public static void main(String[] args)
    {
        int[] x = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        int   i;
        
        System.out.println("Original Array:");
        display(x);

        System.out.println("Array after cycling once:");
        cycleElements( x );
        display(x);
   }
   
   private static void display( int[] x )
   {
       int i;
       
       System.out.print("Array: ");
       for(i=0; i < x.length; i++)
       {
           if( i < x.length-1 )
                System.out.printf("%3d, ", x[i]);
           else
                System.out.printf("%3d\n", x[i]);
       }
    }
  
   private static void cycleElements( int [] x)
   {
       int i; 
       int last;
       
       last =x[x.length-1];
       
       for( i =x.length-1; i >=1; i--)
       x[i] = x[i-1];
       x[0]=last;
       // arraylist x.add(0, x.remove(x.size()-1);

    }
    
}

