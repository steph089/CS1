
/**
  class representing students object
 */
class Student
{
    private String name,graden;
    private int grade;
    //method for student object
    public Student (String a, int b, String c)
    {
        name = a;
        grade = b;
        graden = c;
    }
    //a method to print student information
    public String toString()
    {
        return name + "\t" + grade + "\t" + graden;
    }
    
    
}

    

