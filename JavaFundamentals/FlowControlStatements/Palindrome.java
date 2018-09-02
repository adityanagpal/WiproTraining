/*
Write a Java program to find if the given number is palindrome or not.
*/
import java.util.Scanner;
class Palindrome
{
  public static void main(String args[])
  {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m=0;
    int b=a;
    while(a!=0)
    {
      m=10*m+(a%10);
      a=a/10;
    }
    if(b==m)
    System.out.println("Palindrome Number");
    else
      System.out.println("Not a Palindrome Number");
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac Palindrome.java
aditya@aditya-Lenovo-G50-80:~/java$ java Palindrome
Enter the number:
121
Palindrome Number
*/
