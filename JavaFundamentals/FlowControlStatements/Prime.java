/*
Write a program to check if a given number is prime or not.
*/
import java.util.Scanner;
class Prime
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int n = sc.nextInt();
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
aditya@aditya-Lenovo-G50-80:~/java$ javac Prime.java
aditya@aditya-Lenovo-G50-80:~/java$ java Prime
Enter the Number:
5
Prime Number
*/

