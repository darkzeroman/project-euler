package problems;
/**
 * 
 */

/**
 * @author dkz
 * @Problem 02: By considering the terms in the Fibonacci sequence whose values
 *          do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem02 {
	// Benchmarking, for upper bound = 4,000,000  SlowMethod: 2-3ms, fastMethod: 2-3ms
	// No significant difference when increasing upper bound to max_int
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod();
		fasterMethod();

	}

	public static void slowMethod() {
		// just finding the fibonacci sequence and then adding it to an int if it's
		// divisible by 2
		int a = 1;
		int b = 1;
		int sum = 0;
		int aplusb = 0;
		while (aplusb < 4000000) {
			if (b % 2 == 0) {
				sum = sum + b;
			}
			aplusb = a + b;
			a = b;
			b = aplusb;

		}
		System.out.println(sum);

	}

	public static void fasterMethod() {
		// looking at the sequence, it can be seen that every third number is
		// even, so just add that one
		int a = 1;
		int b = 1;
		int sum = 0;
		int aplusb = 0;
		int count = 1;
		while (aplusb < 4000000) {
			count++;
			if (count == 3) {
				sum = sum + b;
				count = 0;
			}
			aplusb = a + b;
			a = b;
			b = aplusb;

		}
		System.out.println(sum);

	}

}
