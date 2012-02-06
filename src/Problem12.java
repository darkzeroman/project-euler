import java.util.ArrayList;

/**
 * 
 */

/**
 * @author 01
 * 
 */
public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod();
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
	
	

}
