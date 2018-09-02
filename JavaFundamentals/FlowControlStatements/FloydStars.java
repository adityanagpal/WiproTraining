/*
 Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number

Example1:

     C:\>java Sample 3

     O/P Expected :
                   *
                   *  * 
                   *  *  *
*/
class FloydStars
{
 public static void main(String args[])
 {
  int n = Integer.parseInt(args[0]);
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<i+1;j++)
   {
    System.out.print("* ");
   }
   System.out.println();
  }
 }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac FloydStars.java
aditya@aditya-Lenovo-G50-80:~/java$ java FloydStars 4
* 
* * 
* * * 
* * * * 
*/
