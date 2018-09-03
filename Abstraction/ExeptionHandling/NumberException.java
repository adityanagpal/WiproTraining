import java.util.Scanner;

public class NumberException {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try{
			int num= sc.nextInt();
			System.out.println(num*num);
			System.out.println("The work has been done successfully");
		}
		catch(Exception e){
			System.out.println("Entered input is not a valid format for an integer.");	
		}
		

	}

}
