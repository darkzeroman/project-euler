package problems;
public class Problem10 {
	/**
	 * @author Vidhur Vohra
	 * @Problem: Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fasterMethod();
	}

	// Implementation of Sieve of Eratosthenes
	public static void fasterMethod() {
		int max = 2000000;
		boolean[] arr = new boolean[max];
		for (int i = 0; i < max; i++)
			arr[i] = true;

		arr[0] = false;
		arr[1] = false;
		arr[2] = true;

		for (int i = 2; i < max; i++) {
			if (arr[i]) {
				int interval = i;
				int index = interval * 2;
				while (index < max) {
					arr[index] = false;
					index += interval;
				}
			}
		}
		System.out.println(addArr(arr));
	}

	/**
	 * Iterating array, if true, it should be a prime, and summing it
	 */
	public static long addArr(boolean[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i])
				sum += i;
		return sum;

	}

	/**
	 * Helper function, testing if a number is prime
	 * 
	 * @param n
	 * @return boolean, true if prime, false if not
	 */
	public static boolean isPrime(long n) {
		if ((n & 1) == 0)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void printArray(boolean[] arr) {
		for (int i = 0; i < 50; i++)
			if (arr[i])
				System.out.print(i + " ");
		System.out.println();
	}
}
