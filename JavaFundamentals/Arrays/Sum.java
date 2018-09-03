/*
 Write a program to print the sum of the elements of the array with the given below condition.
If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/
class Sum
{
 public static void main(String args[])
 {
  int sum=0,d=0;
  int l=args.length;
  int[] a=new int[l];
  for(int i=0;i<l;i++)
   a[i]=Integer.parseInt(args[i]);
  int i=0;
  while(i<l)
  {
   if(a[i]==6)
   {
    for(int j=i;j<l;j++)
    {
     if(a[j]==7)
     {
      d=j-i+1;
     }
    }
   }
    i+=d;
    d=0;
    sum=sum+a[i];
    i++;
   }
  System.out.println("Your output:"+sum);
 }
}

/*
aditya@aditya-Lenovo-G50-80:~/java$ javac Sum.java
aditya@aditya-Lenovo-G50-80:~/java$ java Sum 10 3 6 1 2 7 9
Your output:22
aditya@aditya-Lenovo-G50-80:~/java$ java Sum 7 1 2 3 6
Your output:19
aditya@aditya-Lenovo-G50-80:~/java$ java Sum 1 6 4 7 9
Your output:10
*/
