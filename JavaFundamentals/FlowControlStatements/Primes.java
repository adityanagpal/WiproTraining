/*
Write a program to print prime numbers between 10 and 99.
*/
class Primes
{
   public static void main(String args[])
  {
  for(int n=10;n<100;n++)
  {
    int d=0;
    for(int i=2;i<n/2;i++)
    {
      if(n%i==0)
      {
        d=1;
        break;
      }
    }
    if(d==0)
      System.out.println(n+" ");
  }
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac Primes.java
aditya@aditya-Lenovo-G50-80:~/java$ java Primes
11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/
