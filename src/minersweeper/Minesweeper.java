package minersweeper;
import java.util.Random;

public class Minesweeper {

	int bombs;
	int gridSize;
	boolean[][] mineGrid;

	Random rand = new Random();

	public Minesweeper(int gridSize, int bombs) {

		this.gridSize = gridSize;
		this.bombs = bombs;
		mineGrid = new boolean[gridSize][gridSize];

	}
	
	public void populateGrid() {

		for(int i = 0; i <= bombs; i++) {

			int x = rand.nextInt(gridSize-1);
			int y = rand.nextInt(gridSize-1);
			mineGrid[x][y] = true;
		}
	}

	public void showGrid() {
		for(boolean[] row : mineGrid) {
			for(boolean cell : row) {

				if(cell) {

					System.out.print("X");
				}else {
					System.out.print("O");

				}
			}
			System.out.println();
		}
	}
}
