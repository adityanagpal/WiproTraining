import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter The elements in the array");
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		
		try{
			n= sc.nextInt();
			System.out.println("The array element at index 2 = "+arr[n]);
			System.out.println("The array element successfully accessed");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
