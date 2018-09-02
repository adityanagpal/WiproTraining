/*
Write a program to convert from upper case to lower case and vice versa of an alphabet and print
the old character and new character as shown in example (Ex: a->A, M->m).
*/
import java.util.Scanner;
class Case
{
public static void main(String args[])
{
char c;
int d=0;
System.out.println("enter the charcter");
Scanner sc = new Scanner(System.in);
c = sc.next().charAt(0);
System.out.println("You entered: "+c);
if((int)c>64&&(int)c<98)
d=(int)c+32;
else if((int)c>96&&(int)c<123)
d=(int)c-32;
else
System.out.println("Invalid input");
System.out.println("Case conversion: "+(char)d);
}
}

/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ java Case
enter the charcter
f
You entered: f
Case conversion: F
*/
