public class Package03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod(600851475143L);
	}

	/**
	 * Iterating up to n, testing if i is divides evenly, if so, check again to
	 * make sure i is prime
	 * 
	 * @param n
	 */
	public static void slowMethod(long n) {
		for (int i = 1; i < n; i++) {
			if ((n % i == 0) && isPrime(i))
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
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
