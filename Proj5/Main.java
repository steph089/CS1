
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException
    {   String name, graden;
        int grade, total=0, texc=0, tok=0, tfail=0, count=0, cexc=0, cok=0, cfail=0;
        
        double average, aexc, aok, afail;
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
            Student st = new Student(name, grade, graden);
            //counts and totals Excellent students
            if (graden == "Excellent")
            {
                texc = texc + grade;
                cexc++;
            }
             //counts and totals OK students
            if (graden == "OK")
            {
                tok = tok + grade;
                cok++;
            }
             //counts and totals Failure students
            if (graden == "Failure")
            {
                tfail = tfail + grade;
                cfail++;
            }
            //prints out current students information
            System.out.println(st);
            //counts and totals all students
            total = total + grade; 
            count++;
        }
        //average grades are calculated here
        average = (double)total/count;
        aexc = (double)texc/cexc;
        aok = (double)tok/cok;
        afail = (double)tfail/cfail;
        //Prints for user
        System.out.println("There are " + count + " students with average grade " + average);
        System.out.println("There are " + cexc + " excellent students with average grade " + aexc);
        System.out.println("There are " + cok + " OK students with average grade " + aok);
        System.out.println("There are " + cfail + "failure students with average grade " + afail);
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
