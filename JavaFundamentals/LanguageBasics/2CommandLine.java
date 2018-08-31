/*Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below.

Example:

If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

[Note: It is mandatory to pass two arguments in command line]*/

class CommandLine
{
public static void main(String[] args)
{
if(args.length==2)
System.out.println(args[0]+" Technologies "+args[1]);
else
System.out.println("2 Commandline Arguments is mandatory");
}
}

/*
Output:-
aditya@aditya-Lenovo-G50-80:~/java$ java CommandLine wipro Banglore
wipro Technologies Banglore
aditya@aditya-Lenovo-G50-80:~/java$ java CommandLine wipro 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	at CommandLine.main(2command_line.java:5)
aditya@aditya-Lenovo-G50-80:~/java$ java CommandLine wipro Banglore india
2 Commandline Arguments is mandatory
*/
