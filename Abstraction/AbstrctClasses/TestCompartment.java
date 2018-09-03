import java.util.Random;

abstract class Compartment{
	abstract void notice();
}
class FirstClass extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("This is First Class Compartment");
		
	}
	
}
class Ladies extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("This is Ladies Compartment");
		
	}
	
}
class General extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("This is General Compartment");
		
	}
	
}
class Luggage extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("This is Luggage Compartment");
		
	}
	
}
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartment= new Compartment[10];
		Random random= new Random();
		int num= random.nextInt(4)+1;
		switch(num){
		case 1:
			FirstClass firstClass= new FirstClass();
			firstClass.notice();
			break;
		case 2:
			Ladies ladies= new Ladies();
			ladies.notice();
			break;
		case 3:
			General general= new General();
			general.notice();
			break;
		case 4:
			Luggage luggage= new Luggage();
			luggage.notice();
			break;
		}

	}

}
