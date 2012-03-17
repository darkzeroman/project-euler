/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author dkz
 * 
 */
public class Problem24 {
	static ArrayList<String> al = new ArrayList<String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] flags = new boolean[10];
		StringBuilder origStr = new StringBuilder("0123456789");
		StringBuilder str = new StringBuilder();
		makePerms(flags, origStr, str, 0);
		System.out.println("Sorting");
		Collections.sort(al);
		System.out.println(al.get(1000000-1));
	}

	public static void makePerms(boolean[] flags, StringBuilder origStr,
			StringBuilder str, int length) {
		if (length == origStr.length()) {
			al.add(str.toString());
			//System.out.println(str);
			return;
		}

		for (int i = 0; i < origStr.length(); i++) {
			if (flags[i] == false) {
				flags[i] = true;
				str.append(origStr.charAt(i));
				makePerms(flags, origStr, str, length + 1);
				str.deleteCharAt(length);
				flags[i] = false;
			}
		}
	}
}
