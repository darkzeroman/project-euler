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
public class Problem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			slowMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// brute forcing the solution

	public static void slowMethod() throws IOException {
		int[][] grid = readTo2DIntGrid();
		long max = 0;
		String index = "0,0";
		// checking rows
		for (int k = 0; k < grid.length - 3; k++)
			for (int i = 0; i < grid[k].length - 3; i++) {
				long temp = 1;
				for (int j = 0; j < 4; j++) {
					temp = grid[k][i + j] * temp;
				}
				if (temp > max) {
					max = temp;
					index = i + "," + k;
				}
			}
		System.out.println("max: " + max + " at index: " + index);

		// checking columns
		for (int k = 0; k < grid.length - 3; k++)
			for (int i = 0; i < grid[k].length - 3; i++) {
				long temp = 1;
				for (int j = 0; j < 4; j++) {
					temp = grid[i + j][k] * temp;
				}
				if (temp > max) {
					max = temp;
					index = k + "," + i;
				}
			}
		System.out.println("max: " + max + " at index: " + index);

		// checking diagonally top left to bottom right
		for (int k = 0; k < grid.length - 3; k++)
			for (int i = 0; i < grid[k].length - 3; i++) {
				long temp = 1;
				for (int j = 0; j < 4; j++) {
					temp = grid[k + j][i + j] * temp;
				}
				if (temp > max) {
					max = temp;
					index = i + "," + k;
				}
			}
		System.out.println("max: " + max + " at index: " + index);
		// checking diagonally bottom left to top right
		for (int k = 0; k < grid.length - 3; k++)
			for (int i = 3; i < grid[k].length; i++) {
				long temp = 1;
				for (int j = 0; j < 4; j++) {
					temp = grid[k + j][i - j] * temp;
				}
				if (temp > max) {
					max = temp;
					index = i + "," + k;
				}
			}
		System.out.println("max: " + max + " at index: " + index);

	}

	public static void makeArray(String text) {
		int[][] grid = new int[20][20];

	}

	/** Read the contents of the given file. */
	public static int[][] readTo2DIntGrid() throws IOException {
		int[][] grid = new int[20][20];
		File file = new File("inputs/Problem11.txt");

		Scanner scanner = new Scanner(new FileInputStream(file));
		try {
			for (int i = 0; i < 20; i++)
				for (int j = 0; j < 20; j++)
					grid[i][j] = scanner.nextInt();
		} finally {
			scanner.close();
		}
		return grid;
	}

}
