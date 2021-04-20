package src.src;
/**
 * RandomGrades2 - using ArrayLists
 * 
 */

import java.util.*;

public class RandomGrades2
{
    public static void main(String[] args)
    {  
        Scanner console = new Scanner(System.in);
       ArrayList<Double> b;
       b = new ArrayList<Double>();
        int     numGrades; 
        
        
        System.out.printf("How many grades would you like? ");
        numGrades = console.nextInt();
       
       System.out.printf("PART (A): Construct a random array.\n");
       System.out.print("Grades: ");
       int i;
       for( i =0; i < numGrades; i++)
       {
           b.add(i,new Double((int)(100*Math.random())));
           System.out.printf(" %.0f ", b.get(i).doubleValue());
        }
       System.out.println(""); 
       System.out.printf("PART (B): Reverse the array.\n");
       System.out.print("Grades: "); 
       reverseArray(b);
       System.out.println("");
       System.out.printf("PART (C): Display SUM, AVG, MIN, and MAX.\n"); 
       System.out.printf("Sum of grades        =%.0f\n", sum(b));
       System.out.printf("Average of grades    =%.2f\n", average(b)); 
       System.out.printf("Minimum grade        =%.0f\n", min(b));
       System.out.printf("Maximum grade        =%.0f\n", max(b));
    }
    
    public static void reverseArray(ArrayList<Double>x)
    {
      ArrayList<Double>b = new ArrayList<Double>();
      
      int i;
        for( i = 0; i < x.size() ; i++)
        { 
           b.add(i, new Double(x.get(x.size()-1).doubleValue()-i));
        }
        
      int d;
       for( i = 0; i < b.size() ; i++)
        { 
           System.out.printf(" %.0f ", b.get(i));
        }

    }
    
   public static double sum( ArrayList<Double>x)
    {
        double sum = 0;
        int i;
        
        for( i = 0; i < x.size(); i++)
        {
            sum = sum + x.get(i).doubleValue();
        }
        
        return sum;
    }
    
    public static double average( ArrayList<Double> x)
    {
        double average ;
        
        average = sum(x) / x.size();
        
        return average;
        
    }
    
   public static double min( ArrayList<Double> x)
   {
        double min=100;
        
      if( x.get(0).doubleValue() > x.get(1).doubleValue())
      {
          min = x.get(1).doubleValue();
        }
        else
      { 
          min = x.get(0).doubleValue();
        }
      for(int i =1; i < x.size(); i++)
      {
          if( min >= x.get(i).doubleValue())
          {
              min = x.get(i).doubleValue();
            }
        }

       return min;
        
   }
   
    public static double max( ArrayList<Double> x)
     {
         double max=0;
         
        if(x.get(0).doubleValue() > x.get(1).doubleValue())
        {
            max = x.get(0).doubleValue();
        }
        else
        {
            max = x.get(1).doubleValue();
         }
         for(int i =1; i < x.size(); i++)
        {
          if( max <= x.get(i).doubleValue())
          {
              max = x.get(i).doubleValue();
            }
        }
        return max;
    }
}
