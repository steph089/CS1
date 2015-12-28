Write a program in Java and run it in BlueJ according to the following specifications: • The program reads a text file with student records (first name, last name and grade) and prints them in the terminal window.
• After the name and grade it also prints the type of the grade: excellent (> 89), ok [60,89], and failure (< 60).
• Then the program prints the number of students, and their average grade and also the number of students and their average in each grade category (excellent, ok, and failure).
• For example, with the input file students.txt the program must print the following:
  
John Smith     90 excellent 
Barack Obama   95 excellent 
Al Clark       80 ok 
Sue Taylor     55 failure 
Ann Miller     75 ok 
George Bush    58 failure 
John Miller    65 ok 

There are 7 students with average grade 74.0 
There are 2 excellent students with average grade 92.5 
There are 3 ok students with average grade 73.3333 
There are 2 failre students with average grade 56.5
 Requirements and restrictions: • Use the scanner class for reading from file.
• Use the Student.java class from the course website to represent each student record and extend it to handle the grade categories.
• Print the student records (name, grade and grade category) using the println method with only a student object passed to it (hint: modify the toString method in class Student to return also the grade category).
• When you write your program
 ? use proper names for the variables suggesting their purpose.
? format your code accordingly using indentation and spacing.
? use multiple line comment in the beginning of the code and write your name, e-mail address, class, and section.
? for each line of code add a short comment to explain its meaning.
