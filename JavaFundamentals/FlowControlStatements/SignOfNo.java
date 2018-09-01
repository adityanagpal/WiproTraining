/*
Write a program to check if a given number is Positive, Negative, or Zero.
*/
import java.util.Scanner;
class SignOfNo
{
public static void main(String args[])
{
System.out.println("Enter the number to check");
Scanner sc=new Scanner(System.in);
float n = sc.nextInt();
if(n>0)
System.out.println("Positive Number");
if(n<0)
System.out.println("Negative Number");
else
System.out.println("Zero");
}
}

/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ javac SignOfNo.java
aditya@aditya-Lenovo-G50-80:~/java$ java SignOfNo
Enter the number to check
5
Positive Number
*/
