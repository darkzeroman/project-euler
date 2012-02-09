package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author 01
 * 
 */
public class Problem13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod();
	}

	public static void slowMethod() {
		int[][] grid = null;
		try {
			grid = readTo2DIntGrid();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long start = System.currentTimeMillis();

		int numCols = grid[0].length;
		int numRows = grid.length;

		int[] answer = new int[grid[0].length];
		int carryOver = 0;
		for (int i = numCols - 1; i >= 0; i--) {
			int sum = 0;
			for (int j = 0; j < numRows; j++) {
				int temp = grid[j][i];
				sum += grid[j][i];

			}
			sum += carryOver;
			answer[i] = sum % 10;
			carryOver = sum / 10;
		}
		System.out.print(carryOver);
		for (int i = 0; i < answer.length; i++)
			System.out.print(answer[i]);
		System.out.println();

		System.out.println(System.currentTimeMillis() - start);

	}

	/** Read the contents of the given file. */
	public static int[][] readTo2DIntGrid() throws IOException {
		int[][] grid = new int[100][50];
		File file = new File("inputs/Problem13.txt");

		Scanner scanner = new Scanner(new FileInputStream(file));
		try {
			for (int i = 0; i < 100; i++) {
				String temp = scanner.next();
				for (int j = 0; j < 50; j++) {
					grid[i][j] = Character.getNumericValue(temp.charAt(j));
				}
			}
		} finally {
			scanner.close();
		}
		return grid;
	}
}
