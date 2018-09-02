/*
Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001
*/
import java.util.Scanner;
class ReverseNumber
{
  public static void main(String args[])
  {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m=0;
    while(a!=0)
    {
      m=10*m+(a%10);
      a=a/10;
    }
    System.out.println("Reverse is:"+m);
  }
}
/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ javac ReverseNumber.java
aditya@aditya-Lenovo-G50-80:~/java$ java ReverseNumber
Enter the number:
234
Reverse is:432
*/
