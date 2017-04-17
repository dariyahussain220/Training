package assignments;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumber {

	/*
	 * public static void main(String[] args) { int[] input = { 6, 9, 5, 4, 7,
	 * 3, 8, 10, 9, 12, 11, 14 }; System.out.println(findMissing(input)); }
	 */
	public int findMissing(int[] input) {
		int temp = 0;
		int missing = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			//System.out.println(input[i]);
		}
			// Arrays.sort(input);
			for (int k = 0; k <input.length-1; k++) {
				
				if (input[k]+1 != input[k+1]) {
					missing = input[k]+1;
					break;
				}
			}
		return missing;
	}
}
