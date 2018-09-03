package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena veena= new Veena();
		veena.play();
		Saxophone sax= new Saxophone();
		sax.play();
		Playable[] playable= new Playable[2];
		playable[0]= veena;
		playable[1]= sax;
		playable[0].play();
		playable[1].play();

	}

}
