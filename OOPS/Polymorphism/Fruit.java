/*
Create  a base class Fruit which has name ,taste and size as its attributes. A method called eat() is created which
describes the name of the fruit and its taste.  Inherit the same in 2 other class Apple and Orange and override the
eat() method to represent each fruit taste.
*/
class Fruit
{
  public String name,taste;
  public double size;
  Fruit(String n,String t,double s)
  {
    name=n; taste=t; size=s;
  }
  public void eat()
  {
    System.out.println("Name="+name+" Taste="+taste);
  }
}
class Apple
{
  Apple(String n,String t,double s)
  {
    name=n; taste=t; size=s;
  }
  public void eat()
  {
    System.out.println("Name="+name+" Taste="+taste);
  }
}
class Orange
{
  Orange(String n,String t,double s)
  {
    name=n; taste=t; size=s;
  }
  public void eat()
  {
    System.out.println("Name="+name+" Taste="+taste);
  }
}
class Fruits
{
  public static void main(String args[])
  {
    Apple a=new Apple("apple","sweet",5);
    a.eat();
    Oranhe o=new Orange("orange","sour",5);
    o.eat(); 
  }
}
