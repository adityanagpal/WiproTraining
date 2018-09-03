/*
Create a class called Author is designed as follows:

It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’).
• One constructor to initialize the name, email and gender with the given values.

And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you have just created),
  price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again
  there is no setter for name and author.
Write the class Book (which uses the Author class written earlier). 
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

*/
import java.util.Scanner;
class Author
{
  private String name,email;
  private char gender;
  Author(String n,String e,char g)
  {
    name=n; email=e; gender=g;
  }
  public void showAuthor()
  {
    System.out.println("Name="+name+" Email="+email+" Gender="+gender);
  }
}
class Book
{
  Scanner sc=new Scanner(System.in)
  private String name;
  private Author author;
  private double price;
  private int qtyInStock;
  public void getName()
  {
    name=sc.nextLine();
  }
  public void getAuthor()
  {
    author=sc.nextLine();
  }
  public void getPrice()
  {
    price=sc.nextDouble();
  }
  public void setPrice(double p)
  {
    price=p;
  }
  public void getQtyInStock()
  {
    qtyInStock=nextInt();
  }
  public void setQtyInStock(int q)
  {
    qtyInStock=q;
  }
  public static void main(String args[])
  {
    Book abook=new Book();
    abook.getname();
    System.out.println(name);
    abook.getQtyInStock();
    System.out.println(qtyInStock);
    abook.getPrice();
    System.out.println(price);
    author = Author("Subhash","subhash123@gmail.com",'m');
    author.showAuthor();
  }
}
