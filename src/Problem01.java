/**
 * 
 */

/**
 * @author dkz
 * @Problem 01: Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem01 {

	// Benchmarking:
	// for n = 1000, SlowMethod: 1ms, FasterMethod:2ms
	// for n = 1000000, SlowMethod: 49ms, FasterMethod:2ms
	// for n = 1000000000, SlowMethod: 13019ms, FasterMethod: 2ms
	// SlowMethod: O(n) (plus more really, because modulus takes a long time)
	// FastMethod O(1)
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod(1000);
		// fastMethod(1000);
	}

	public static void slowMethod(int n) {
		// just iterating up to n and if n has a 0 remainder when divided by 3
		// or 5, add it to the sum
		int sum = 0;
		for (int i = 1; i <= n; i++)
			if ((i % 3 == 0) || (i % 5 == 0))
				sum = sum + i;
		System.out.println(sum);
	}

	public static void fastMethod(int n) {
		// inclusion/exclusion rules used from combinatorics
		int sum;
		sum = 5 * (findSummationOfOne(n / 5));
		sum = sum + 3 * (findSummationOfOne(n / 3));
		sum = sum - 15 * findSummationOfOne(n / 15);
		System.out.println(sum);
	}

	public static int findSummationOfOne(int bound) {
		return (int) Math.round(((Math.pow(bound, 2) + bound) / 2));
	}
}
