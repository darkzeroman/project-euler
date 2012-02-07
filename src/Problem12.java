import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 
 */

/**
 * @author 01
 * 
 */
public class Problem12 {
	static Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// slowMethod();
		betterMethod();
		oneMoreBetterMethod();

	}

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

	public static void betterMethod() {

		boolean haveFound = false;
		int count = 1;
		while (!haveFound) {
			count++;
			ht = new Hashtable<Integer, Integer>();
			findPrimesList(count * (count + 1) / 2);

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

	public static void oneMoreBetterMethod() {

		boolean haveFound = false;
		int currNum = 1;
		int count = 2;
		while (!haveFound) {
			ht = new Hashtable<Integer, Integer>();
			currNum += count;
			count++;
			findPrimesList(currNum);

			Enumeration<Integer> e = ht.keys();
			int num = 1;
			while (e.hasMoreElements()) {
				num = num * (1 + ht.get(e.nextElement()));
			}
			if (num >= 500)
				break;
		}
		System.out.println(currNum);
	}

	public static void findPrimesList(int n) {
		int currMax = n;
		for (int i = 2; i <= currMax; i++) {
			if (currMax % i == 0) {
				if (ht.get(i) == null)
					ht.put(i, 1);
				else {
					int temp = ht.get(i);
					temp++;
					ht.put(i, temp);
				}

				currMax = currMax / i;
				i = 1;
			}
		}
		int x = 0;
	}
}
