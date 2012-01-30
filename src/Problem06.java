/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumsquares = 0;

		for (int i = 1; i < 101; i++)
			sumsquares += Math.pow(i, 2);
		double squaresum = 0;
		int sum = 0;
		for (int i = 1; i < 101; i++)
			sum += i;
		squaresum = Math.pow(sum, 2);
		System.out.println(sumsquares);
		System.out.println((int)(sumsquares - (int) squaresum));

	}
}
