import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}
public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try{
			System.out.println("Enter Name and Marks in 3 subjects of 1st Student: ");
			String name1= sc.nextLine();
			int marks1= sc.nextInt();
			if(marks1<0 || marks1>100){
				throw new MyException("Marks out of range");
			}
			int marks2= sc.nextInt();
			if(marks2<0 || marks2>100){
				throw new MyException("Marks out of range");
			}
			int marks3= sc.nextInt();
			if(marks3<0 || marks3>100){
				throw new MyException("Marks out of range");
			}
			int sum= marks1+ marks2+ marks3;
			System.out.println("Enter Name and Marks in 3 subjects of 2nd Student: ");
			String name2= sc.next();
			marks1= sc.nextInt();
			if(marks1<0 || marks1>100){
				throw new MyException("Marks out of range");
			}
			marks2= sc.nextInt();
			if(marks2<0 || marks2>100){
				throw new MyException("Marks out of range");
			}
			marks3= sc.nextInt();
			if(marks3<0 || marks3>100){
				throw new MyException("Marks out of range");
			}
			sum+=marks1+ marks2+ marks3;
			System.out.println("Average of the marks of 2 students= "+sum/2);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}

	}

}
