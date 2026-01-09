package h1;

public class Grid {
	Cell [][] gridArray;
 
	public Grid (Cell[][] cells, int gridRows, int gridCols){
		this.gridArray= new Cell [gridRows][gridCols];
			for (int i = 0; i < gridRows; i++) {
				for (int j = 0; j < gridCols; j++) {
					this.gridArray[i][j] = new Cell (i,j);
				}
			}
		}
	public void computeNextGen () {
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[i].length; j++) {
				gridArray[i][j].countLivingNeighbors(gridArray);
			}			
		}
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[i].length; j++) {
				Cell c = gridArray [i][j];
				c.setAlive(c.getIsAliveNextGen());
			}
		}
	}
	
	public void computeGeneration (int n) {
		for (int i = 0; i < n; i++) {
			computeNextGen();
		}
	}
	
}
	
