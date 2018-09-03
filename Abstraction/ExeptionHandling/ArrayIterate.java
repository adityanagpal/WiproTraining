
public class ArrayIterate {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException {
		// TODO Auto-generated method stub
		int sum=0;
		int avg=0;
		int count=0;
		try{
			for(int i=0;i<args.length;i++){
				sum+=Integer.parseInt(args[i]);
				count++;
			}
		}
		catch(Exception e){
			
		}
		avg=sum/count;
		System.out.println("Sum is: "+sum+" Avg is: "+avg);

	}

}
