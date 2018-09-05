/*
Write a program to initialize an integer array and find the maximum and minimum value of an array.
*/
import java.util.Scanner;
class MaxMin
{
  public static void main(String args[])
  {
    int max,min
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements to be check");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the "+n+" elements in array");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    max=min=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>max)
        max=a[i];
      if(a[i]<min)
        min=a[i];
    }
    System.out.println("Max="+max+" and Min="+min);
  }
}
