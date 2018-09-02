/*
Write a program to print first 5 values which are divisible by 2, 3, and 5.
*/
class Divisibles
{
  public static void main(String args[])
  {
    int d=0;
    int n=30;
    while(d!=5)
    {
      if(n%2==0&&n%3==0&&n%5==0)
      {
        System.out.print(n+" ");
        d++;
      }
      n++;
    }
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac Divisibles.java
aditya@aditya-Lenovo-G50-80:~/java$ java Divisibles
30 60 90 120 150
*/
