/*
Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
Eg1) java Example
O/P: No values
Eg2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
[Note: You can use length property of an array to check its length
*/
class NumArgs
{
public static void main(String args[])
{
int l=args.length;
if(l==0)
System.out.print("No values");
else
{
System.out.println(args[0]);
for(int i=1;i<l;i++)
{
System.out.print(","+args[i]);
}
}
}}

/*
aditya@aditya-Lenovo-G50-80:~/java$ javac NumArgs.java
aditya@aditya-Lenovo-G50-80:~/java$ java NumArgs 10 20 30
10,20,30aditya@aditya-Lenovo-G50-80:~/java$ java NumArgs 
No values
aditya@aditya-Lenovo-G50-80:~/java$ 
*/
