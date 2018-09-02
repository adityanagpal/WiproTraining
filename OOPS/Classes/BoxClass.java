/*
Create a class Box that uses a parameterized method to initialize the dimensions of a box.
(dimensions are width, height, depth of double type). The class should have a method that
can return volume. Obtain an object and print the corresponding volume in main() function.
*/
class Box
{
 private int depth,height,width;
 public void setdimentions(int h,int w,int d)
 {
   height=h;depth=d;width=w;
 }
  public void showdimention()
  {
    System.out.println("Height="+height);
    System.out.println("Width="+width);
    System.out.println("Depth="+depth);
  }
}

class BoxClass
{
  public static void main(String args[])
  {
    Box b=new Box();
    b.setdimentions(4,3,2);
    b.showdimention();
  }
}
/*
aditya@aditya-Lenovo-G50-80:~/java$ javac BoxClass.java
aditya@aditya-Lenovo-G50-80:~/java$ java BoxClass
Height=4
Width=3
Depth=2
*/
