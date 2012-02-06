import java.util.ArrayList;

/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		slowMethod();
		noArrayMethod();
	}

	/**
	 * leaving in an array for debugging
	 */
	public static void slowMethod() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		int i = 1;
		while (al.size() != 10001) {
			boolean isPrime = true;
			for (int j = 3; j <= Math.round(Math.pow(i, .5)); j = j + 2) {
				if (i % j == 0)
					isPrime = false;
			}
			if (isPrime)
				al.add(new Integer(i));
			i = i + 2;
		}
		System.out.println(al.get(10000));
	}

	/**
	 * taking out the array
	 */
	public static void noArrayMethod() {
		int count = 0;
		int i = -1; // starting at -1, because we have to add 2 to start
		do {
			i = i + 2;
			boolean isPrime = true;
			for (int j = 3; j <= Math.round(Math.pow(i, .5)); j = j + 2) {
				if (i % j == 0)
					isPrime = false;
			}
			if (isPrime)
				count++;

		} while (count < 10001);
		System.out.println(i);
	}
}