/**
 *Steve Marshall

* Marshalls@my.ccsu.edu
 
* CS-151-70 Fall'12
 */

import java.util.*; 

public class calculate { 
//an additional method that calculates the sum of the divisors 
static int sum_divisors(int n)
 { 
//initiates integer
int sum=0; 
//for i counting until reaching the variable n
for(int i=1;i<=n;i++)
//if its an even division with no remainder then adds sum to i
 { if(n%i==0)sum+=i;} 
 //returns sum integer to the line where this was initiated
 return sum;
} 

public static void main(String args[]) { 

 //initiates scanner
 Scanner s = new Scanner(System.in); 
 //prints text
System.out.print("Enter the value for N: ");
//initiates integer n and scans it for a value
 int N=s.nextInt(); 
 //prints text
 System.out.println("N\tAbundand\tDeficient\tPerfect\tPrime"); 
 //initiates integers
 int abun=0; 
 int def=1;
 int per=0; 
 int prime=0; 
 //prints starting number
 System.out.println("1\t0\t\t1\t\t0\t0\t");
 //for i counting until reaching the variable N 
 for(int i=2;i<=N;i++) 
 { 
     //calls sum_divisors method and sets the variable sd to whatever is returned, also sends the current variable i into the method
     int sd=sum_divisors(i); 
     //checks for abundant numbers by seeing if the sum of the divisors is greater then the current number N
     if(sd>2*i) abun++;
     //check if its deficientby seeing if the sum of the divisors is less then the current number N
     if(sd<2*i) def++;
     //checks for perfect numbers by seeing if the sum of the divisors is equal to the current number N
     if(sd==2*i) per++; 
     //checks for prime numbers by seeing if the sum of the divisors is equal to one plus the current number N
     if(sd==(1+i)) prime++;
     //prints
     System.out.println( i +"\t"+ abun +"\t\t"+ def +"\t\t"+ per +"\t"+ prime);
    } 
} 

} 
