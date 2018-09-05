/*
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 4 integer numbers

Example2:

     C:\>java Sample 1 2 3 4

     O/P Expected : 
     
  The given array is :
  1 2 
  3 4 
  The reverse of the array is :
  4 3 
  2 1
*/
class Revere
{
     public static void main(String args[])
     {
          if(args.length!=4)
               System.out.println("Please Enter only 4 arguments in command line");
          else
          {
               int a[][] = new int[2][2];
               a[0][0] = Integer.parseInt(args[0]);
               a[0][1] = Integer.parseInt(args[1]);
               a[1][0] = Integer.parseInt(args[2]);
               a[1][1] = Integer.parseInt(args[3]);
               System.out.println("The given array is:");
               for(int i=0;i<2;i++)
               {
                    for(int j=0;j<2;j++)
                    {
                         System.out.println(a[i][j]+" ");
                    }
                    System.out.println();
               }
               a[0][0]=a[1][1]+a[0][0];
               a[1][1]=a[0][0]-a[1][1];
               a[0][0]=a[0][0]-a[1][1];
               a[0][1]=a[1][0]+a[0][1];
               a[1][0]=a[0][1]-a[1][0];
               a[0][1]=a[0][1]-a[1][0];
               System.out.println("The reverse of the array is:");
               for(int i=0;i<2;i++)
               {
                    for(int j=0;j<2;j++)
                    {
                         System.out.println(a[i][j]+" ");
                    }
                    System.out.println();
               }
          }
     }
}
