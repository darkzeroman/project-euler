package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import tools.ArrayMethods;
import tools.QuickSort;

public class Problem18 {
	static int count = 0;

	/**
	 * @Problem Find the maximum total from top to bottom of the triangle below:
	 */
	public static void main(String[] args) {
		// slowMethod();
		fasterMethod();
	}

	public static void fasterMethod() {
		int[][] grid = null;

		try {
			grid = readTo2DIntGrid();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// wid1h = 15, starting at 1

		for (int i = grid.length - 2; i >= 0; i--)
			for (int j = 0; j < i + 1; j++)
				grid[i][j] = grid[i][j]
						+ Math.max(grid[i + 1][j], grid[i + 1][j + 1]);

		System.out.println(grid[0][0]);

		// System.out.println(Arrays.toString(grid[1]));
	}

	/**
	 * Brute force Method
	 */
	public static void slowMethod() {
		int[][] grid;
		try {
			grid = readTo2DIntGrid();
			int[] combs = new int[16384];
			slowMethodHelper(combs, grid, 0, 0, 0);
			ArrayMethods.findMax(combs);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void slowMethodHelper(int[] combs, int[][] grid, int sum,
			int row, int col) {
		sum = sum + grid[row][col];

		if (grid.length - 1 == row) {
			combs[count++] = sum;
			return;
		}
		if (col < grid[0].length - 1) {
			slowMethodHelper(combs, grid, sum, row + 1, col);
			slowMethodHelper(combs, grid, sum, row + 1, col + 1);
		} else
			slowMethodHelper(combs, grid, sum, row + 1, col);
	}

	/** Read the contents of the given file into an int grid. */
	public static int[][] readTo2DIntGrid() throws IOException {
		File file = new File("inputs/Problem18.txt");

		// Finding number of lines
		Scanner scanLines = new Scanner(new FileInputStream(file));
		int count = 0;
		try {
			while (scanLines.hasNextLine()) {
				scanLines.nextLine();
				count++;
			}
		} finally {
			scanLines.close();
		}

		int[][] grid = new int[count][count + 1];

		// Getting file contents
		Scanner scanner = new Scanner(new FileInputStream(file));
		try {
			for (int i = 0; i < 15; i++) {
				String temp = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(temp);

				for (int j = 0; j < i + 1; j++) {
					grid[i][j] = Integer.parseInt(st.nextToken());
				}
			}
		} finally {
			scanner.close();
		}
		return grid;
	}
}
