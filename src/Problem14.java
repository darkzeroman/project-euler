/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Problem14 {

	/**
	 * @Problem Which starting number, under one million, produces the longest
	 *          chain?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slowMethod();
		for (int i = 1; i < 50; i++)
			System.out.println(rule(i)+" " +  i);

	}

	public static void slowMethod() {
		int max = 0;
		int value = 0;
		for (int i = 1; i < 1000000; i++) {
			int temp = rule(i);
			if (temp > max) {
				max = temp;
				value = i;
			}
		}
		System.out.println(max + " at: " + value);
	}

	public static int rule(int input) {
		long num = input;

		int count = 0;
		while (num != 1) {
			count++;
			if ((num & 1) != 0) // number is odd
				num = 3 * num + 1;
			else
				num = num / 2;

		}
		return ++count;
		// System.out.println(count);

	}

}
