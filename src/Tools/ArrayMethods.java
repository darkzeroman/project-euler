/**
 * 
 */
package Tools;

/**
 * @author dkz
 * 
 */
public class ArrayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printArr(int[] arr) {
		StringBuffer bs = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			bs.append(arr[i]);
			bs.append(" ");
		}
		System.out.println(bs);

	}

	static void inArrSwap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void findMax(int[] arr) {
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i])
				maxIndex = i;
		}
		System.out.println(arr[maxIndex]);
	}
}
