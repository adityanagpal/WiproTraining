/*
Write a program to print month in words, based on input month in numbers
Example1:

     C:\>java Sample 12

     O/P Expected : December

Example2:

     C:\>java Sample 

     O/P Expected : Please enter the month in numbers

Example3:

     C:\>java Sample 15

     O/P Expected : Invalid month
   */

class Month
{
public static void main(String args[])
{
System.out.println("Enter the code of required month:");
if(args.length==0)
System.out.println("please enter the month in numbers");
else{
switch(args[0]){
case "1":
System.out.println("January");
break;
case "2":
System.out.println("Febuary");
break;
case "3":
System.out.println("March");
break;
case "4":
System.out.println("April");
break;
case "5":
System.out.println("May");
break;
case "6":
System.out.println("June");
break;
case "7":
System.out.println("July");
break;
case "8":
System.out.println("August");
break;
case "9":
System.out.println("September");
break;
case "10":
System.out.println("October");
break;
case "11":
System.out.println("November");
break;
case "12":
System.out.println("December");
break;
default:
System.out.println("Invalid Code");
break;
}
}
}}
/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ javac Month.java
aditya@aditya-Lenovo-G50-80:~/java$ java Month 
please enter the month in numbers
aditya@aditya-Lenovo-G50-80:~/java$ java Month 15
Invalid Code
aditya@aditya-Lenovo-G50-80:~/java$ java Month 12
December
*/
