package assignments;

public class SwapNum {
	/*
	 * public static void main(String[] args) {
	 * System.out.println(toString(swaping(1000,250))); }
	 */
	public int[] numbers = new int[2];

	public int[] swaping(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		numbers[0] = a;
		numbers[1] = b;
		return numbers;
	}

	public String toString(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i] + " ";
		}
		if (str.endsWith(" "))
			str.trim();
		return str + "]";
	}

}
