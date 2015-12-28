
/**
 *Steve Marshall

* Marshalls@my.ccsu.edu
 
* CS-151-70 Fall'12
 */
import java.util.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException
    {   
       
        String name, graden;
        int grade, total=0, texc=0, tok=0, tfail=0, count=0, cexc=0, cok=0, cfail=0;
        
        double average, aexc, aok, afail;
        //arrays initialization
        Student [] Excellent;
        Student [] ok;
        Student [] fail;
        Excellent = new Student[10];
        ok = new Student[10];
        fail = new Student[10];
        //Specific student for best and worst declared assuming grade cannot be greater than 100 or less than 0
        Student best = new Student(null,0);
        Student worst = new Student(null,100);
        
        Scanner fileInput = new Scanner(new File("students.txt"));
        while (fileInput.hasNext())
        {
            //set variable to name, by reading the first then last name on txt doc
            name = fileInput.next() + " " + fileInput.next();
            //sets grade of current student
            grade = fileInput.nextInt();
            //finds the type of grade and sets variable as string
            graden = Gradename(grade);
            //creates student object for current student
            //adds to excellent list
            if (graden == "Excellent")
            {
                Excellent[cexc] = new Student(name,grade);
                cexc++;
            }
             //adds to ok list
            if (graden == "OK")
            {
                ok[cok] = new Student(name,grade);
                cok++;
            }
             //adds to fail list
            if (graden == "Failure")
            {
                fail[cfail] = new Student(name,grade);
                cfail++;
            }
            //checks if better or worse then current best/worst score and switchs best/worst if its better or worse
            if(count == 0 || grade > best.GetGrade())
            {best = new Student(name,grade);}
            if(count == 0 || grade < worst.GetGrade())
            {worst = new Student(name,grade);}
            
            //counts and totals all student grades
            total = total + grade; 
            count++;
        }
        //for user
        System.out.println("Students with excellent grades:");
        //prints 
        for(int i=0;i < cexc;i++)
        {
        System.out.println(Excellent[i]);
        }
        System.out.println();
        System.out.println("Students with ok grades:");
        for(int i=0;i < cok;i++)
        {
        System.out.println(ok[i]);
        }
        System.out.println();
        System.out.println("Students with failure grades:");
        for(int i=0;i < cfail;i++)
        {
        System.out.println(fail[i]);
        }
        
        average = (double)total/count;
        
        System.out.println();
        System.out.println("total number of students:  " + count);
        System.out.println("Average Grade:  " + average);
        System.out.println("Highest grade: " + best);
        System.out.println("Lowest Grade: " + worst);
    }
    
 //a method for checking the type of grade
public static String Gradename(int g)
    {
        //g = grade
        if (g > 89){return "Excellent";}
        if (g > 60 && g < 89){return "OK";}
        if (g < 60) {return "Failure";}
        return "Null";
    }
    
}