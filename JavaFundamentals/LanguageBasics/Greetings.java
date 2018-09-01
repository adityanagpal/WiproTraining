/*
Write a Program to accept a String as a Command line argument and the program should print a Welcome message.

Example :

     C:\> java Sample John
    
      O/P Expected : Welcome John     */
      
      class Greetings
      {
      public static void main(String args[])
      {
      System.out.println("Welcome "+args[0]);
      }
      }
      
/*
OUTPUT:-
aditya@aditya-Lenovo-G50-80:~$ cd java
aditya@aditya-Lenovo-G50-80:~/java$ javac Greetings.java
aditya@aditya-Lenovo-G50-80:~/java$ java Greetings Aditya
Welcome Aditya
*/
