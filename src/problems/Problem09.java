package problems;
/**
 * 
 */

/**
 * @author 01
 * 
 */
public class Problem09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// slowMethod();
		System.out.println();
		newMethod();
	}

	public static void slowMethod() {

		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 0; i <= 1000; i++)
			for (j = 0; j <= 1000; j++)
				for (k = 0; k <= 1000; k++)
					if ((i * i + j * j == k * k) && (i + j + k == 1000))
						System.out.println(i + " " + j + " " + k);
	}

	public static void newMethod() {
		int a, b, c;
		for (c = 1000; c > 1; c--)
			for (b = 1000 - c - 1; b > 0; b--) {
				a = 1000 - c - b;
				// System.out.println(a + " " + b + " " + c);

				if ((a * a + b * b == c * c)) {
					System.out.println(a + " " + b + " " + c);
					System.out.println(a * b * c);
				}

			}

	}
}
