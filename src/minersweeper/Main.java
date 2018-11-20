package minersweeper;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gridSize;
		int bombs;
		
		System.out.println("Enter grid size: ");
		gridSize = sc.nextInt();
		System.out.println("Enter number of bombs: ");
		bombs = sc.nextInt();
		Minesweeper ms = new Minesweeper(gridSize, bombs);
		
		ms.populateGrid();
		ms.showGrid();
		
		sc.close();
	}

}
