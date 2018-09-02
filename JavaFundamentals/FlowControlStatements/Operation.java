/*
Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing 
the operation, the program should ask the user if he wants to continue. If the user presses y or
Y, then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]
*/
import java.util.Scanner;
class Operation
{
  public static void main(String args[])
  {
    char d='y';
    while(d=='Y'||d=='y')
    {
    System.out.println("Select 1. Add   and   2. Sub");
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    if(c==1)
    {
      System.out.println("Enter two numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("The sum of two numbers is:"+(a+b));
    }
    else if(c==2)
    {
      System.out.println("Enter two numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("The subtraction of two numbers is:"+(a-b));
    }
    else
    {
      System.out.println("enter 1 or 2");
    }
      System.out.println("want to continue then press y");
      d = sc.next().charAt(0);
    }
  
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac Operation.java
aditya@aditya-Lenovo-G50-80:~/java$ java Operation
Select 1. Add   and   2. Sub
1
Enter two numbers:
3
4
The sum of two numbers is:7
want to continue then press y
y
Select 1. Add   and   2. Sub
2
Enter two numbers:
5
2
The subtraction of two numbers is:3
want to continue then press y
n
*/
