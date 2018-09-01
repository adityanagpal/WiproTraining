/*
Write a program to check if a given number is odd or even.
*/
import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}

/*
aditya@aditya-Lenovo-G50-80:~/java$ javac EvenOdd.java
aditya@aditya-Lenovo-G50-80:~/java$ java EvenOdd
Enter the number
5
Odd
*/
