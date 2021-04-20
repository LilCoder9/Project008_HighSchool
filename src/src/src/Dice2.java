package src.src;

/**
 * Write a description of class Dice2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Dice2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int dice;
        int time;
        int[] roll;
        roll = new int[7];
        
        System.out.print("How many times should the die be rolled?");
        time = console.nextInt();
        
        for(int number = 0; number < time; number++)
        {
            dice =(int)(6* Math.random())+1;
         
            
            switch(dice){
                case 1: roll[1] = roll[1] + 1;
                        break;
                case 2: roll[2] =roll[2] + 1;
                        break;
                case 3: roll[3] = roll[3] + 1;
                        break;
                case 4: roll[4] = roll[4] + 1;
                        break;
                case 5: roll[5] =roll[5] + 1;
                        break;
                case 6: roll[6] = roll[6] + 1;
                        break;
                    }
            
                }
        
                System.out.printf("ones:     %d\n", roll[1]);
                System.out.printf("twos:     %d\n", roll[2]);
                System.out.printf("threes:   %d\n", roll[3]);
                System.out.printf("fours:    %d\n", roll[4]);
                System.out.printf("fives:    %d\n", roll[5]);
                System.out.printf("sixes:    %d\n", roll[6]);
    
  }
}
