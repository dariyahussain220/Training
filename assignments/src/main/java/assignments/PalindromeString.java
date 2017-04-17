package assignments;

public class PalindromeString {
	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(isPalindrome("ababba")); }
	 */
	public boolean isPalindrome(String input) {
		if (input == null)
			return false;
		boolean flag = true;
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		for (int j = 0; j < input.length(); j++) {
			if (output.charAt(j) == input.charAt(j))
				continue;
			else
				flag = false;
		}
		return flag;
	}
}
