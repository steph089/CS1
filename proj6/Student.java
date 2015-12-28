/**
  class representing students object
 */
class Student
{
    private String name,graden;
    private int grade;
    //method for student object
    public Student (String a, int b)
    {
        name = a;
        grade = b;
    }
    //a method to print student information
    public String toString()
    {
        return name + "\t" + grade;
    }
    
    public int GetGrade() { return grade;}
    
}