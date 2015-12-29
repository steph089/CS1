Write a program in Java and run it in BlueJ according to the following specifications: • The program first asks the user for an integer (N).
• Then the program calculates and tabulates the following functions (see these links for deficient, abundant and perfect numbers):
 ? the number of abundant numbers less than or equal to n, where n=1,2,...,N;
? the number of deficient numbers less than or equal to n, where n=1,2,...,N;
? the number of perfect numbers less than or equal to n, where n=1,2,...,N;
? the number of prime numbers less than or equal to n, where n=1,2,...,N;
 • If the user enters 20 for N the printout of the tabulation must look like the following:
 N    Abundand    Deficient    Perfect    Prime 
1    0           1            0          0 
2    0           2            0          1 
3    0           3            0          2 
4    0           4            0          2 
5    0           5            0          3 
6    0           5            1          3 
7    0           6            1          4 
8    0           7            1          4 
9    0           8            1          4 
10   0           9            1          4 
11   0           10           1          5 
12   1           10           1          5 
13   1           11           1          6 
14   1           12           1          6 
15   1           13           1          6 
16   1           14           1          6 
17   1           15           1          7 
18   2           15           1          7 
19   2           16           1          8 
20   3           16           1          8 Requirements and restrictions: • Use the scanner class for input.
• Use proper names for the variables suggesting their purpose.
• Format your code accordingly using indentation and spacing.
• Use multiple line comment in the beginning of the code and write your name, e-mail address, class, and section.
• For each line of code add a short comment to explain its meaning.
 Extra credit (up to 2 points): After tablulating the functions (explained above) the program should print a bar diagram with the number of primes less than or equal to n (horizontally) for each n=1,...,N (vertically). Use asterisk characters (*) to print the diagram (see listing 6.4 in the textbook). 