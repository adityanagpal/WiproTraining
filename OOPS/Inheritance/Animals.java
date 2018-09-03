/*
Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods.
Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/
class Animal
{
  public void eat(){
  System.out.println("Animal eat");
  }
  public void sleep(){
  System.out.println("Animal sleep");
  }
}
class Bird extends Animal
{
  public void eat(){
  System.out.println("Bird eat");
  }
  public void sleep(){
  System.out.println("Bird sleep");
  }
  public void fly(){
  System.out.println("Bird fly");
  }
}
class Animals
  {
    public static void main(String args[])
    {
      Animal animal=new Animal();
      animal.eat();
      animal.sleep();
      Bird bird = new Bird();
      bird.eat();
      bird.sleep();
      bird.fly();
    }
  }
