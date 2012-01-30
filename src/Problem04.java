/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one = 0;
		int two = 0;
		int largestPalindrome = 0;
		for (one = 0; one < 1000; one++)
			for (two = 0; two < 1000; two++)
				if (isPalindrome(one * two))
					if (largestPalindrome < one * two)
						largestPalindrome = one * two;
		System.out.println(largestPalindrome);
	}

	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub

		String temp = num + "";

		for (int i = 0; i < temp.length() / 2; i++) {
			if (temp.charAt(i) != temp.charAt(temp.length() - i - 1))
				return false;
		}
		return true;
	}

}
