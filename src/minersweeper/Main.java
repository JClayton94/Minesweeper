package minersweeper;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int gridSize;
		int bombs = 0;
		boolean notTooBig = false;

		System.out.println("Enter grid size: ");
		gridSize = sc.nextInt();

		while(!notTooBig) {
			System.out.println("Enter number of bombs: ");
			bombs = sc.nextInt();

			if(bombs >= (gridSize*gridSize)) {
				System.out.println("Too many bombs!");
				continue;
			} else {
				notTooBig = true;
			}
		}
		Minesweeper ms = new Minesweeper(gridSize, bombs);

		ms.populateGrid();
		ms.showGrid();

		sc.close();
	}

}
