package tools;

import problems.Problem12;

/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Benchmark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		benchmarkMethod();

	}

	public static void benchmarkMethod() {
		long startTime = System.currentTimeMillis();
		Problem12.oneMoreBetterMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime)
				+ "ms");
	}

}
