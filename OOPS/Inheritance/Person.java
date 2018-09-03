/*
Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the 
employee class are annual salary (double), the year the employee started to work, and the national 
insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/
class Person
{
  public String name;
  Person(String n)
  {
    name=n;
  }
  public void showPerson()
  {
    System.out.println("Name = "+name);
  }
}
/*
in the file Employee.java the first command at top is
import Person;
then the remaining code is here
*/
class Employee extends Person
{
  public double annual_salary;
  public int start_year;
  public String insurance_no;
  Employee(double a,int s,String i)
  {
    annual_salary=a; start_year=s; insurance_no=i;
  }
  showEmployee()
  {
    System.out.println("Annual salary="+annaual_salary);
    System.out.println("Start year="+start_year);
    System.out.println("Insurance Number="+insurance_no);
  }
}
class TestEmployee
{
  public static void main(String args[])
  {
    Persn p=new Person("Subhash");
    p.showPerson();
    Employee e=new Employee(35000,2014,"1234");
    e.showEmployee();
  }
}
