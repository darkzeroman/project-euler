import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Problem12 {
	static Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

	/**
	 * @Problem What is the value of the first triangle number to have over five
	 *          hundred divisors?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// slowMethod();
		betterMethod();
		oneMoreBetterMethod();
	}

	/**
	 * Brute force method, will not complete
	 */
	public static void slowMethod() {
		boolean haveFound = false;
		int count = 1;
		while (!haveFound) {
			ArrayList<Integer> al = findFactors(count * (count + 1) / 2);
			count++;
			if (al.size() > 500)
				haveFound = true;
		}
	}

	/**
	 * part of the brute force method, will take too long to run
	 */
	public static ArrayList<Integer> findFactors(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i < num / 2; i++)
			if (num % i == 0) {
				if (!al.contains(i)) {
					al.add(i);
					al.add(num / i);
				}
			}
		return al;
	}

	/**
	 * Using the divisor function property to determine the number of factors,
	 * check Wikipedia for more information
	 */
	public static void betterMethod() {

		boolean haveFound = false;
		int count = 1;
		while (!haveFound) {
			count++;
			ht = new Hashtable<Integer, Integer>();
			findPrimes(count * (count + 1) / 2);

			Enumeration<Integer> e = ht.keys();
			int num = 1;
			while (e.hasMoreElements()) {
				num = num * (1 + ht.get(e.nextElement()));
			}
			if (num >= 500)
				break;
		}
		System.out.println(count * (count + 1) / 2);
	}

	/**
	 * A different way to count the triangle numbers, I can't decide if this
	 * method is more "intuitive"
	 */
	public static void oneMoreBetterMethod() {

		int currNum = 1;
		int incrementValue = 2;
		while (true) {
			ht.clear();
			currNum += incrementValue;
			incrementValue++;
			findPrimes(currNum);

			Enumeration<Integer> e = ht.keys();
			int num = 1;
			while (e.hasMoreElements()) {
				num = num * (1 + ht.get(e.nextElement()));
			}
			if (num >= 500) // meeting the ending condition
				break;
		}
		System.out.println(currNum);
	}

	/**
	 * Helper function, fills a hashtable with the prime factors of number n
	 */
	public static void findPrimes(int n) {
		// keep trying to find an incrementing number that divides n, if there
		// is one, reset the number

		for (int i = 2; i <= n; i++)
			if (n % i == 0) {
				if (ht.get(i) == null)
					ht.put(i, 1);
				else {
					int temp = ht.get(i);
					temp++;
					ht.put(i, temp);
				}
				n = n / i;
				i = 1;
			}
	}
}
