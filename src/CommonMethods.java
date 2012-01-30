/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class CommonMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//benchmarkMethod();
		testOdd();
	}
	public static void testOdd(){
		
		System.out.println(11 & 0);
	}

	public static void benchmarkMethod() {
		long startTime = System.currentTimeMillis();
		Problem02.slowMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime)
				+ "ms");
	}

}
