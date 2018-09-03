abstract class GeneralBank{
	abstract public void getSavingInterestRate();
	abstract public void getFixedInterestRate();
}
class ICICIBank extends GeneralBank{

	@Override
	public void getSavingInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("ICICIBank Savings ROI 4%");
		
	}

	@Override
	public void getFixedInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("ICICIBank Fixed ROI 8.5%");
		
	}
	
}
class KotMBank extends GeneralBank{

	@Override
	public void getSavingInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("KOTMBank Savings ROI 6%");
		
	}

	@Override
	public void getFixedInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("KOTMBank Fixed ROI 9%");
		
	}
	
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank bank1= new ICICIBank();
		bank1.getSavingInterestRate();
		bank1.getFixedInterestRate();
		KotMBank bank2= new KotMBank();
		bank2.getSavingInterestRate();
		bank2.getFixedInterestRate();
		GeneralBank bank3= new ICICIBank();
		bank3.getSavingInterestRate();
		bank3.getFixedInterestRate();
		GeneralBank bank4= new KotMBank();
		bank4.getSavingInterestRate();
		bank4.getFixedInterestRate();

	}

}
