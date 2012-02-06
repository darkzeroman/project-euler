/**
 * @author dkz
 * 
 */
public class Problem06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 100;
		slowMethod(max);
		fasterMethod(max);
		evenFasterMethod(max);
		answerKey(max);

	}
	
	public static void slowMethod(int max) {
		// TODO Auto-generated method stub
		int sumsquares = 0;

		for (int i = 1; i <= max; i++)
			sumsquares += (int) Math.pow(i, 2);
		int squaresum = 0;
		int sum = 0;
		for (int i = 1; i <= max; i++)
			sum += i;
		squaresum = (int) Math.pow(sum, 2);
		// System.out.println(sumsquares);
		System.out.println(squaresum - sumsquares);
	}

	public static void fasterMethod(int max) {
		int sum = 0;

		for (int i = 1; i <= max; i++)
			for (int j = i + 1; j <= max; j++)
				sum += 2 * i * j;

		System.out.println(sum);
	}

	public static void evenFasterMethod(int max) {
		int sum = 0;

		for (int i = 1; i < max; i++)
			sum += 2 * i * (sumNums(i + 1, max));
		System.out.println(sum);
	}

	public static void answerKey(int max) {
		int sum = max * (max + 1) / 2;
		int sum_sq = (2 * max + 1) * (max + 1) * max / 6;
		System.out.println(sum * sum - sum_sq);

	}

	public static int sumNums(int i, int j) {
		return Math.round((j - i + 1) * (float) (j + i) / 2);
	}
}
