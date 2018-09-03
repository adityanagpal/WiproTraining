class NewException extends Exception{
	public NewException(String s){
		super(s);
	}
}
public class AgeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= args[0];
		int age= Integer.parseInt(args[1]);
		try{
			if(age<18 || age>=60){
				throw new NewException("Age Should be between 18 and 60");
			}
			else{
				System.out.println("Name: "+name+" Age: "+age);
			}
		}
		catch(NewException e){
			System.out.println(e.getMessage());
		}

	}

}
