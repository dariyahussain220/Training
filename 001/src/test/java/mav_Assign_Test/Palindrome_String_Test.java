package mav_Assign_Test;

import static org.junit.Assert.*;
import mav_Assignments.Palindrome_String;

import org.junit.Before;
import org.junit.Test;

public class Palindrome_String_Test {

	Palindrome_String palindrome=null;
	@Before
	public void setUp() throws Exception {
		palindrome=new Palindrome_String();
	}

	@Test
	public void isPalindrome_test_in() {
		assertEquals(true, palindrome.isPalindrome("level"));
		assertEquals(false, palindrome.isPalindrome("dedicated"));
	}
	@Test
	public void isPalindrome_test_Null(){
		assertEquals(false, palindrome.isPalindrome(null));
	}
}
