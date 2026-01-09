package h1;

	public class Cell {
		int indexRow;
		int indexCol;
		boolean alive;
		int numLivingNeighbors;
		boolean isAliveNextGen;
		
		public int getIndexRow () {
			return indexRow;
		}
		public void setIndexRow (int indexRow) {
			this.indexRow = indexRow;
		}
		
		public int getIndexCol () {
			return indexCol;
		}
		public void setIndexCol (int indexCol) {
			this.indexCol = indexCol;
		}
			
		public boolean getAlive () {
			return alive;
		}
		public void setAlive (boolean alive) {
			this.alive = alive;
		}
				
		public int getNumLivingNeighbors () {
			return numLivingNeighbors;
		}
		public void setNumLivingNeighbors (int numLivingNeighbors) {
			this.numLivingNeighbors = numLivingNeighbors;
		}
		
		public boolean getIsAliveNextGen () {
			return isAliveNextGen;
		}
		public void setIsAliveNextGen (boolean isAliveNextGen) {
			this.isAliveNextGen = isAliveNextGen;
		}
		
		Cell (int indexRow, int indexCol, boolean alive) {
			this.indexRow = indexRow;
			this.indexCol = indexCol;
			this.alive = alive;
		}
		
		Cell (int indesRow, int indexCol) {
			this.indexRow = indexRow;
			this.indexCol = indexCol;
		}
		
		public void countLivingNeighbors (Cell [][] gridArray) {
			int Count = 0;
			
			for (int i = -1; i <= 1; i++) {
				for (int j = -1; j <= 1; j++) {
					if (i == 0 && j == 0) continue;
					int R = this.indexRow + i;
					int C = this.indexCol + j;
					
					if (R >= 0 && R < gridArray.length && C >= 0 && C > gridArray[0].length) {
						if (gridArray[R][C].getAlive()) {
							Count++;
						}
					}
				}
			}
			this.numLivingNeighbors = Count;
			decideNextStatus();
		}
		
		private void decideNextStatus () {
			if (this.alive) {
				this.isAliveNextGen = (numLivingNeighbors == 3 || numLivingNeighbors == 2);
			}
			else {
				this.isAliveNextGen = (numLivingNeighbors == 3);
			}
		}
	}
	
