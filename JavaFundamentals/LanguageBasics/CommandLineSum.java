/*
Write a Program to accept two integers through the command line 
argument and print the sum of the two numbers

Example:

     C:\>java Sample 10 20

     O/P Expected : The sum of 10 and 20 is 30
Write a Program to accept two integers through the command line 
argument and print the sum of the two numbers

Example:

     C:\>java Sample 10 20

     O/P Expected : The sum of 10 and 20 is 30         */
     
 class CommandLineSum
 {
 public static void main(String args[])
 {
 int r=Integer.parseInt(args[0]);
 r+=Integer.parseInt(args[1]);
 System.out.println(r);
 }
 }
 
 /*
 OUTPUT:-
 aditya@aditya-Lenovo-G50-80:~/java$ javac CommandLineSum.java
aditya@aditya-Lenovo-G50-80:~/java$ java CommandLineSum 10 20
30
*/
