package assignmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignments.PalindromeString;

public class PalindromeStringTest {

	PalindromeString palindrome = null;

	@Before
	public void setUp() throws Exception {
		palindrome = new PalindromeString();
	}

	@Test
	public void isPalindromeTestIn() {
		assertEquals(true, palindrome.isPalindrome("level"));
		assertEquals(false, palindrome.isPalindrome("dedicated"));
	}

	@Test
	public void isPalindromeTestNull() {
		assertEquals(false, palindrome.isPalindrome(null));
	}
}
