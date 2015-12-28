

/**
 
 * asks for birth month and year then calculates your age
 * with comments on age and error catching
  
 
 *Steve Marshall

* Marshalls@my.ccsu.edu
 
* CS-151-70 Fall'12
 
*/


//initiates scanner tool
import java.util.Scanner;
//beginning of class
public class Project_2
{
    public static void main (String[] args) 
    {
        //creates the scanner
        Scanner scan = new Scanner(System.in);
        //creates a string for each entry that the user will make
        String Entry1,Entry2;
        //creates integers for all of the needed numbers
        int MOB,YOB,Months, Years, MonthsLived;
        //current date here
        final int CurrentMonth = 10;
        final int CurrentYear = 2012;
        //defaults some integers to 999
        MOB = 999;
        YOB = 999;
        Years = 999;
        //Start asks for birth month
        System.out.print("Enter Month of Birth: ");
        //Scans entry and puts it as a string
        Entry1 = scan.next();
        //starts a loop for testing if MOB is within range
        while (MOB<1 || MOB>12)
        {
            //Tests to see if string can become integer
            while (!Type.isInteger(Entry1))
        {
            //While it is not an integer it will send an error and ask for the birth month again, until it is an integer
            System.out.println("Incompatible entry, Please retry");
            System.out.println();
            System.out.print("Enter Month of Birth: ");
            Entry1 = scan.next();
        }    
        //If it is an integer then it sets the variable MOB to that number
        MOB = Integer.parseInt(Entry1);
        //tests again to see if it needs to tell you to retry
        if (MOB<1 || MOB>12)
            //asks to retry
            {System.out.println("Invalid Month, Please Retry");
            System.out.println();
            System.out.print("Enter Month of Birth: ");
            Entry1 = scan.next();}
        }
        //blank line
        System.out.println();
        //asks for birth year
        System.out.print("Enter Year of Birth: ");
        //scans entry and puts as string
        Entry2 = scan.next();
        //starts a loop for testing if YOB is within range
        while (YOB<1912 || YOB>2011)
        {
        //Tests to see if string can become integer
        while (!Type.isInteger(Entry2)) 
                {
                    //While it is not an integer it will send an error and ask for the birth month again, until it is an integer
                    System.out.println("Incompatible entry, Please retry");
                    System.out.println();
                    System.out.print("Enter Year of Birth: ");
                    Entry2 = scan.next();
                }
        //If it is an integer then it sets the variable MOB to that number    
        YOB = Integer.parseInt(Entry2);
        //Tests again to see if it needs to tell you to retry
        if (YOB<1912 || YOB>2011)
        {
            //asks to retry
            System.out.println("Invalid Year, Please Retry");
            System.out.print("Enter Year of Birth: ");
            Entry2 = scan.next();
        }
        
        }
        
       //Calculations and Printing              
       MonthsLived = CurrentMonth + CurrentYear * 12 - MOB - YOB * 12;
       Months = MonthsLived % 12;  // Remainder from integer division 
       Years = MonthsLived / 12;   // Integer division 
       //Printing
       System.out.println();
       System.out.println("You are " + Years + " years and " + Months +" months old");

       //Tests if older then 65   
       if (Years >= 65)
             {System.out.println("You are a senior");}
       //tests in younger then 18
       if (Years < 18)
             {System.out.println("You are a kid");}
       //tests if its your birth month 
       if (MOB == 10)
             {System.out.println("Happy Birthday!");}
       //blank line for aesthetic purposes 
        System.out.println();
                }
            }
    

