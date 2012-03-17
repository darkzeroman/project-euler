package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[][] grid = readTo2DIntGrid();
			System.out.println(DPSolution(grid));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int DPSolution(int[][] grid) {
		int[][] T = new int[grid.length][grid[0].length];
		T[0][0] = grid[0][0];
		for (int i = 1; i < grid.length; i++) {
			T[0][i] = grid[0][i] + T[0][i - 1];
			T[i][0] = grid[i][0] + T[i - 1][0];
		}
		for (int i = 1; i < grid.length; i++)
			for (int j = 1; j < grid[i].length; j++)
				T[i][j] = grid[i][j] + Math.min(T[i - 1][j], T[i][j - 1]);

		return T[grid.length - 1][grid[0].length - 1];

	}

	/** Read the contents of the given file into an int grid. */
	public static int[][] readTo2DIntGrid() throws IOException {
		File file = new File("inputs/Problem81.txt");

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

		int[][] grid = new int[count][count];

		// Getting file contents
		Scanner scanner = new Scanner(new FileInputStream(file));
		try {
			for (int i = 0; i < count; i++) {
				String temp = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(temp);

				for (int j = 0; j < count; j++) {
					grid[i][j] = Integer.parseInt(st.nextToken());
				}
			}
		} finally {
			scanner.close();
		}
		return grid;
	}

}
