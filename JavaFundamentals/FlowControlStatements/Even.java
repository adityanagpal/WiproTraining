/*
 Write a program to print even numbers between 23 and 57, each number should be printed in a separate row.
*/
class Even
{
 public static void main(String args[])
 {
  for(int i=23;i<58;i++)
  {
   if(i%2==0)
    System.out.println(i);
  }
 }
}
/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~/java$ javac Even.java
aditya@aditya-Lenovo-G50-80:~/java$ java Even
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
*/
