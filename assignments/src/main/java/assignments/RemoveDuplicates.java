package assignments;

import java.util.*;

public class RemoveDuplicates {
	/*
	 * public static void main(String[] args) { int[] in=null;
	 * System.out.println(removedup(in)); }
	 */
	public ArrayList<Integer> removeDuplicate(int[] input) {
		int count = 1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		if (input == null || input.length == 0)
			return al;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length - 1; j++) {
				count = 1;
				if (input[i] == input[j]) {
					count = 0;
					break;
				} else if (count != 0 && !al.contains(input[i])) {
					al.add(input[i]);
				}
			}
		}
		return al;
	}
}
