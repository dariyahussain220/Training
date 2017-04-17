package assignmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignments.SwapNum;

public class SwapNumTest {

	SwapNum swap = null;

	@Before
	public void setUp() throws Exception {
		swap = new SwapNum();
	}

	@Test
	public void swapingTestIn() {
		String arr = "[100 250 ]";
		assertEquals(arr, swap.toString(swap.swaping(250, 100)));
	}

}
