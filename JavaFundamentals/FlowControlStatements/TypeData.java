/*
 Intialize a character variable in a program and if the value is alphabet then
 print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"
 */
 import java.util.Scanner;
 class TypeData
 {
 public static void main(String args[])
 {
 System.out.println("Enter the Data");
 Scanner sc = new Scanner(System.in);
 char c = sc.next().charAt(0);
 if((int)c>47&&(int)c<57)
 System.out.println("Digit");
 else if((int)c>64&&(int)c<91)
 System.out.println("Alphabet");
 else if((int)c>96&&(int)c<123)
 System.out.println("Alphabet");
 else
 System.out.println("Special Character");
 }
 }
 
 /*
 OUTPUT:-
 aditya@aditya-Lenovo-G50-80:~/java$ javac TypeData.java
aditya@aditya-Lenovo-G50-80:~/java$ java TypeData
Enter the Data
4
Digit
aditya@aditya-Lenovo-G50-80:~/java$ java TypeData
Enter the Data
a
Alphabet
*/
