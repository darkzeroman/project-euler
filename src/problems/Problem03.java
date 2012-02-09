package problems;
public class Problem03 {
	// Benchmarking: slowMethod is inefficient because we aren't taking
	// advantage of previous computations
	

	/**
	 * @author dkz
	 * @Problem 03: Find the largest prime factor of a composite number
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod(600851475143L);
	}

	/**
	 * Iterating up to n, testing if i is divides evenly, if so, check again to
	 * make sure i is prime. This will NOT complete for large numbers.
	 * 
	 * @param n
	 */
	public static void slowMethod(long n) {
		for (int i = 1; i < n; i++) {
			if (isPrime(i) && (n % i == 0))
				System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * Helper function, testing if a number is prime
	 * 
	 * @param n
	 * @return boolean, true if prime, false if not
	 */
	public static boolean isPrime(long n) {
		if ((n & 1) == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * I had to look up this method from the Project Euler's answer sheet. Not
	 * something I came up by myself
	 * Idea: skip all even numbers and only go up to square root of n
	 * 
	 * @param n
	 */
	public static void fasterMethod(long n) {
		int lastFactor = 0;
		for (int i = 1; i < Math.pow(n, .5); i=i+2) {
			if (isPrime(i) && (n % i == 0))
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
