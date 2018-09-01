/*
Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e
*/
import java.util.Scanner;
class Character
{
public static void main(String args[])
{
System.out.println("Enter the 2 characters:");
Scanner sc = new Scanner(System.in);
char a = sc.next().charAt(0);
char b = sc.next().charAt(0);
if((int)a>(int)b)
System.out.println(b+","+a);
else
System.out.println(a+","+b);
}
}

/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ javac Character.java
aditya@aditya-Lenovo-G50-80:~/java$ java Character
Enter the 2 characters:
a
v
a,v
aditya@aditya-Lenovo-G50-80:~/java$ java Character
Enter the 2 characters:
d
b
b,d
*/
