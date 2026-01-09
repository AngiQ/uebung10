package h2;

public class Spielstein {
	int currentRow;
	int currentCol;
	Spielbrett brett;
	public int getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
	public int getCurrentCol() {
		return currentCol;
	}
	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}
	public Spielbrett getBrett() {
		return brett;
	}
	public void setBrett(Spielbrett brett) {
		this.brett = brett;
	}
	
	public Spielstein(Spielbrett brett, int indexRow, int indexCol) {
		this.currentRow = indexRow;
		this.currentCol = indexCol;
		this.brett = brett;
	}
	
	public boolean movesOut () {
		char direction = brett.getBrett()[currentRow][currentCol].getDirection();

		if (currentRow == 0 && direction == 'U') {
			return true;
		}
	
		if (currentRow == brett.getDim()-1 && direction == 'D') {
			return true;			
		}
		
		if (currentCol == 0 && direction == 'L') {
            return true;
        }
		
        if (currentCol == brett.getDim() - 1 && direction == 'R') {
            return true;
        }
        
		return false;
		
	}
	
	public void go (int n) {
		for (int i = 0; i < n; i++) {
			 Feld currentFeld = brett.getBrett()[currentRow][currentCol];
			 if (currentFeld.isBoese()) {
				 break;
			 }
			 
		 if (movesOut()) {
			 break;
		 }
		 
		 char d = currentFeld.getDirection();
         if (d == 'U') currentRow--;
         else if (d == 'D') currentRow++;
         else if (d == 'L') currentCol--;
         else if (d == 'R') currentCol++;
		}
	}
	

	
	
	
}

