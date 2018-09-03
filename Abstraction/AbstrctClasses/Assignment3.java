import java.util.Random;

abstract class Instrument{
	abstract void play();
}
class Piano extends Instrument{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing  tan tan tan tan");
	}
	
}
class Flute extends Instrument{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing  toot toot toot toot");
		
	}
	
}
class Guitar extends Instrument{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing  tin  tin  tin");
		
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] instrument= new Instrument[10];
		instrument[0]= new Piano();
		instrument[1]= new Flute();
		instrument[2]= new Guitar();
		instrument[3]= new Flute();
		instrument[4]= new Piano();
		instrument[5]= new Flute();
		instrument[6]= new Guitar();
		instrument[7]= new Piano();
		instrument[8]= new Flute();
		instrument[9]= new Guitar();
		Random random= new Random();
		int num= random.nextInt(10)+1;
		instrument[num].play();
		if(instrument[num] instanceof Piano){
			System.out.println("Piano stored at index "+num);
		}
		if(instrument[num] instanceof Flute){
			System.out.println("Flute stored at index "+num);
		}
		if(instrument[num] instanceof Guitar){
			System.out.println("Guitar stored at index "+num);
		}
	}

}
