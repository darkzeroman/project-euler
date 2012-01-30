/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastNum = 0;

		for (int i = 20; i < 999999999 ; i = i + 20) {
			boolean isGood = true;
			lastNum = i;
			for (int j = 1; j <= 20; j++) {
				if (i % j != 0) {
					isGood = false;
					
				}
			}
			if (isGood)
				break;
		}
		System.out.println(lastNum);
	}

}
