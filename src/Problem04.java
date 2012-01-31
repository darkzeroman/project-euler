/**
 * 
 */

/**
 * @author dkz
 * @Problem 04: Find the largest palindrome made from the product of two 3-digit
 *          numbers.
 */
public class Problem04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod();

	}

	/**
	 * Brute forcing for all of the possible combinations and checking if it is
	 * a palindrome
	 */

	public static void slowMethod() {

		int one = 0;
		int two = 0;
		int largestPalindrome = 0;
		for (one = 1000; one > 0; one--)
			for (two = 1000; two > 0; two--)
				if (isPalindrome(one * two))
					if (largestPalindrome < one * two)
						largestPalindrome = one * two;
		System.out.println(largestPalindrome);
	}

	/**
	 * helper function to check for palindrome
	 */
	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub

		String temp = num + "";
		for (int i = 0; i < temp.length() / 2; i++) {
			if (temp.charAt(i) != temp.charAt(temp.length() - i - 1))
				return false;
		}
		return true;
	}

	/**
	 * slightly faster, only check 
	 */
	public static void fasterMethod() {

	}

}
