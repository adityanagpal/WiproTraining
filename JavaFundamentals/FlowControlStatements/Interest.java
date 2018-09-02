/*
Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print
the percentage of interest based on the given conditions.
Interest == 8.2% 
 Gender ==> Female
 Age    ==>1 to 58
Interest == 7.6% 
 Gender ==> Female
 Age    ==>59 -120
Interest == 9.2% 
 Gender ==> Male
 Age    ==>1-60
Interest == 8.3% 
 Gender ==> Male
 Age    ==>61-120
 */
 class Interest
 {
 public static void main(String arg[])
 {
 double interest=0.0;
 int age = Integer.parseInt(arg[1]);
 if(arg[0].equals("Female"))
{
  if(age>0&&age<59)
  interest=8.2;
  else if(age>58&&age<121)
  interest=7.6;
}
else if(arg[1].equals("Male"))
{
  if(age>0&&age<61)
  interest=9.2;
  else if(age>60&&age<121)
  interest=8.3;
}
 else{
 System.out.println("Invalid commandline arguments, type Gender(full and first letter capital) and age(0-120)");
}
 System.out.println("the interest is :"+interest);
 }
 }
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac Interest.java
aditya@aditya-Lenovo-G50-80:~/java$ java Interest Female 24
the interest is :8.2
*/
