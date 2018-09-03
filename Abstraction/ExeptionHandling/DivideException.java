
public class DivideException {
	static void division(int x, int y) throws ArithmeticException{
		System.out.println(x/y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			division(5,0);
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}

	}

}
