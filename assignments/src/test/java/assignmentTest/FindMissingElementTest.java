package assignmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignments.FindMissingNumber;

public class FindMissingElementTest {

	FindMissingNumber findElem = null;

	@Before
	public void setUp() throws Exception {
		findElem = new FindMissingNumber();
	}

	@Test
	public void missingNumtest() {
		int[] input = { 6, 5, 4, 7, 3, 8, 10, 9, 12, 11, 14 };
		assertEquals(13, findElem.findMissing(input));
	}
	@Test
	public void nonMissingNumtest(){
		int[] input = { 6, 5, 4, 7, 3, 8, 10, 9, 12, 11, 14,13};
		assertEquals(0, findElem.findMissing(input));
	}

}
