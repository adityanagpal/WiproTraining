/*
 A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance, 
 in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher will be like Person but 
 will have additional properties such as salary (the amount the teacher earns) and subject 
 (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). The CollegeStudent class will extend the Student 
 class by adding a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

*/
class Person
{
 public String name;
}
class Student extends Person
{
  public int rollno;
}
class Teacher extends Person
{
  public int salary;
  public String subject;
}
class CollegeStudent extends Student
{
  public int year;
  public String major;
}
