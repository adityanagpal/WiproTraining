/*
Write a program to find greatest number in a 3*3 array. The program is supposed to 
receive 9 integer numbers as command line arguments.

Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 9 integer numbers

Example2:

     C:\>java Sample 1 23 45 55 121 222 56 77 89

     O/P Expected : 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/
class Greatest
{
     public static void main(String args[])
     {
          int[][] a=int[3][3];
          int max=0;
          for(int i=0;i<3;i++)
          {
               for(int j=0;j<3;j++)
               {
                    a[i][j]=Integer.parseInt(arg[3*i+j]);
                    if(max<a[i][j])
                         max=a[i][j];
               }
          }
          System.out.println("Greatest = "+max);
     }
}
