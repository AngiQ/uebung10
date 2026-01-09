package h1;

public class H1_main {

	public static void main(String[] args) {
		Grid LifeGame = new Grid(null,9,9);
		LifeGame.gridArray[1][2].setAlive(true);
		LifeGame.gridArray[7][3].setAlive(true);
		LifeGame.gridArray[5][7].setAlive(true);
		LifeGame.gridArray[5][8].setAlive(true);
		LifeGame.gridArray[2][2].setAlive(true);
		LifeGame.gridArray[0][3].setAlive(true);
		LifeGame.gridArray[4][6].setAlive(true);
		LifeGame.gridArray[3][5].setAlive(true);
		
		LifeGame.computeGeneration(0);
		
		System.out.println("Aktueller Spielstand:");
	    for (int i = 0; i < LifeGame.gridArray.length; i++) {
	        for (int j = 0; j < LifeGame.gridArray[i].length; j++) {
	        	if (LifeGame.gridArray[i][j].getAlive()) {
	                System.out.print("1 ");
	            }
	        	else {
	                System.out.print("0 ");
	            }
	        }
	        System.out.println();
	    }
	    
	    LifeGame.computeGeneration(1);
	    
	    System.out.println("Spielstand Runde 1:");
	    for (int i = 0; i < LifeGame.gridArray.length; i++) {
	        for (int j = 0; j < LifeGame.gridArray[i].length; j++) {
	        	if (LifeGame.gridArray[i][j].getAlive()) {
	                System.out.print("1 ");
	            }
	        	else {
	                System.out.print("0 ");
	            }
	        }
	        System.out.println();
	    }

	}

}
