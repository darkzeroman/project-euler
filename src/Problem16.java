/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lowestDigit(11));
	}

	public static int lowestDigit(int exp) {
		exp--;
		exp = exp % 4;
		if (exp == 0)
			return 2;
		else if (exp == 1)
			return 4;
		else if (exp == 2)
			return 8;
		else if (exp == 3)
			return 6;
		return 0;

	}

}
