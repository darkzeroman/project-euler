import java.util.ArrayList;

/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		int i = 1;
		while (al.size() != 10001) {
			// for (int i = 1; i < 1000; i = i + 2) {
			boolean isPrime = true;
			int x = (int) Math.pow(i, .5);
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

}
