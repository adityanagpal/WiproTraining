/*
Write a program to add all the values in a given number and print. Ex: 1234->10
*/
import java.util.Scanner;
class DigitSum
{
  public static void main(String args[])
  {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m=0;
    while(a!=0)
    {
      m=m+(a%10);
      a=a/10;
    }
    System.out.println("Sum of Digits is:"+m);
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac DigitSum.java
aditya@aditya-Lenovo-G50-80:~/java$ java DigitSum
Enter the number:
246
Sum of Digits is:12
*/
