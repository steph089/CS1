
/**
 *Steve Marshall

* Marshalls@my.ccsu.edu
 
* CS-151-70 Fall'12
 */
import java.util.*;

public class Main
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        //asks user question
        System.out.println("How many rational numbers?");
        //grabs the number from user input
        int count=s.nextInt();
        //Initiates aggragates 
        Rational rsum = new Rational (0,1);
        Rational rmax = new Rational (0,1);
        Rational rmin = new Rational (0,1);
        System.out.println("Enter rational numbers(Fractions)");
        //loops for each of the Rational numbers
        for(int i=1;i<=count;i++)
        {
            //finds numerator
            int a = s.nextInt();
            //skips "/"
            String div = s.next("/");
            //finds denominator
            int b = s.nextInt();
            //Defines r as the current Rational number
            Rational r = new Rational (a,b);
            //adds r to the sum
            rsum = rsum.sum(r);
            //checks if r > current max except for first time through
            if(i == 1 || !r.lessThan(rmax))
            {rmax = r;}
            //checks if r < current min except for first time through
            if(i == 1 || r.lessThan(rmin))
            {rmin = r;}
            
            
        }
        //divides sum by number of Rational numbers to get Average
        Rational ravg = rsum.divide(new Rational (count,1));
        //reduces the Average
        ravg.reduce();
        //print the results
        System.out.println("Maximum: " + rmax);
        System.out.println("Minimum: " + rmin);
        System.out.println("Average: " + ravg);
        
    }    
}
