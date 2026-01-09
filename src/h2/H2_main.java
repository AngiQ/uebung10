package h2;

public class H2_main {

	public static void main(String[] args) {
		int size = 8;
		Spielbrett Game = new Spielbrett(size);
		
		for (int R = 0; R < size; R++) {
			for (int C =0; C < size; C++) {
				char zug = 'R';
				if (R == 3 && C == 7) zug = 'L';
				if (R == 1 && C == 4) zug = 'R';
				if (R == 5 && C == 2) zug = 'D';
				if (R == 4 && C == 3) zug = 'D';
				if (R == 2 && C == 7) zug = 'R';
				if (R == 0 && C == 0) zug = 'D';
				if (R == 0 && C == 2) zug = 'D';
				if (R == 0 && C == 3) zug = 'D';
				if (R == 0 && C == 0) zug = 'D';
				if (R == 0 && C == 4) zug = 'D';
				if (R == 0 && C == 6) zug = 'D';
				if (R == 2 && C == 0) zug = 'R';
				if (R == 3 && C == 0) zug = 'R';
				if (R == 6 && C == 0) zug = 'R';
				if (R == 9 && C == 0) zug = 'R';
				if (R == 5 && C == 7) zug = 'L';
				if (R == 7 && C == 7) zug = 'L';
				if (R == 0 && C == 7) zug = 'L';
				
				Game.getBrett()[R][C] = new Feld(false, zug);
			}
		}
		
		Spielstein einStein = new Spielstein(Game, 0,0);
		
		System.out.println("einStein beginnt auf Feld: " + einStein.getCurrentRow() + ", " + einStein.getCurrentCol());
		
		int wuerfel = 6;
		einStein.go(wuerfel);
		
		System.out.println("Nach dem Zug ist einStein mit " + wuerfel + " Schritten hier gelandet: " + einStein.getCurrentRow() + ", " + einStein.getCurrentCol());
		
		
	}

}
