/*
Write a program to print the color name, based on color code. If color code in not valid then
print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
*/
import java.util.Scanner;
class ColorCode
{
public static void main(String args[])
{
System.out.println("Enter the code(in upper case):");
Scanner sc = new Scanner(System.in);
char c = sc.next().charAt(0);
switch(c){
case 'R':
System.out.println("Red");
break;
case 'B':
System.out.println("Blue");
break;
case 'G':
System.out.println("Green");
break;
case 'O':
System.out.println("Orange");
break;
case 'Y':
System.out.println("yellow");
break;
case 'W':
System.out.println("white");
break;
default:
System.out.println("Invalid Code");
break;
}
}
}
/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ javac ColorCode.java
aditya@aditya-Lenovo-G50-80:~/java$ java ColorCode
Enter the code(in upper case):
Y
yellow
*/
