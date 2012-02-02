/**
 * 
 */

/**
 * @author 01
 * 
 */
public class Problem10 {
	BAD CODE
	/**
	 * @Problem: Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod();

	}

	public static void slowMethod() {
		int max = 2000000;
		boolean[] arr = new boolean[max];

		arr[0] = true;
		arr[1] = true;
		arr[2] = false;

		for (int i = 2; i < max; i++) {
			if (!arr[i]) {
				int interval = i;
				i = i * 2;
				while (i < max) {
					arr[i] = true;
					i += interval;
				}
			}
	
		}

		System.out.println(addArr(arr));

	}

	public static int addArr(boolean[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			if (!arr[i])
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

}
