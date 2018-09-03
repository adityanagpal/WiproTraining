/*
Write a program to initialize an array and print them in a sorted fashion
*/
class Sorting
{
  public static void main(String args[])
  {
    int l = args.length;
    int[] a= new int[l];
    for(int i=0;i<l;i++)
    a[i]=Integer.parseInt(args[i]);
    for(int i=0;i<l-1;i++)
    {
      for(int j=i+1;j<l;j++)
      {
        if(a[i]>a[j])
        {
          a[i]=a[i]+a[j];
          a[j]=a[i]-a[j];
          a[i]=a[i]-a[j];
        }
      }
    }
    for(int i=0;i<l;i++)
      System.out.print(a[i]+" ");
  }
}
