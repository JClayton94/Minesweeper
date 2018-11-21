package minersweeper;
import java.util.Random;
import java.util.Scanner;
public class Minesweeper {

	int bombs;
	int gridSize;
	boolean[][] mineGrid;
	boolean[][] playerGrid;

	Random rand = new Random();

	Scanner sc;

	public Minesweeper(int gridSize, int bombs) {

		this.gridSize = gridSize>2?gridSize:2;
		this.gridSize = gridSize;
		this.bombs = bombs;
		mineGrid = new boolean[gridSize][gridSize];
		playerGrid = new boolean[gridSize][gridSize];
		sc = new Scanner(System.in);
		populateGrid();

	}

	public void populateGrid() {

		for(int i = 0; i <= bombs; i++) {

			int x = rand.nextInt(gridSize-1);
			int y = rand.nextInt(gridSize-1);

			if(mineGrid[x][y] == true) {
				i--;
				continue;
			} else {
				mineGrid[x][y] = true;
			}
		}
	}

	public void showGrid() {
		for(boolean[] row : mineGrid) {
			for(boolean cell : row) {

				if(cell) {

					System.out.print("X ");
				}else {
					System.out.print("O ");

				}
			}
			System.out.println();
		}
	}
	public void showPlayerGrid() {
		for(boolean[] row : playerGrid) {
			for(boolean cell : row) {
				if(cell) {

					System.out.print("X ");
				}else {
					System.out.print("O ");

				}
			}
			System.out.println();
		}
	}
	public boolean playerMove() {

		boolean isAlreadyUsed = true;
		int xAxis = 0;
		int yAxis = 0;

		while(isAlreadyUsed) {

			System.out.println("Enter X Coordinate");
			xAxis = sc.nextInt();
			System.out.println("Enter Y Coordinate");
			yAxis = sc.nextInt();
			if(playerGrid[xAxis][yAxis] == true) {
				
				System.out.println("Coordinates already used");
				continue;
			}
			isAlreadyUsed = false;
		}
		playerGrid[xAxis][yAxis] = true;
		
		if(playerGrid[xAxis][yAxis] == mineGrid[xAxis][yAxis]) {
			
			System.out.println("You hit a bomb!");
			return false;
		} else {
			playerGrid[xAxis][yAxis] = true;
			return true;
		}
	}
}
