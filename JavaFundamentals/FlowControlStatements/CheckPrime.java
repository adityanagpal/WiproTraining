/*
Write a Java program to find if the given number is prime or not.

Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number 

Example2:

     C:\>java Sample 1

     O/P Expected : 1 is neither prime nor composite

Example3:

     C:\>java Sample 0

     O/P Expected : 0 is neither prime nor composite
 
 Example4:

     C:\>java Sample 10

     O/P Expected : 10 is not a prime number

Example5:

     C:\>java Sample 7

     O/P Expected : 7 is a prime number
*/
import java.util.Scanner;
class CheckPrime
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int n = sc.nextInt();
       if(n==0||n==1)
            System.out.println("Neither Prime nor Composite");
    int d=0;
    for(int i=2;i<n/2;i++)
    {
      if(n%i==0)
      {
        d=1;
        break;
      }
    }
    if(d==0)
      System.out.println("Prime Number");
    else
      System.out.println("Composite Number");
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac CheckPrime.java
aditya@aditya-Lenovo-G50-80:~/java$ java CheckPrime
Enter the Number:
7
Prime Number
aditya@aditya-Lenovo-G50-80:~/java$ java CheckPrime
Enter the Number:
1
Neither Prime nor Composite
*/
