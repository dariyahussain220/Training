package assignmentTest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import assignments.DuplicateChar;

public class DuplicateCharTest {

	DuplicateChar duplicate = null;

	@Before
	public void setUp() throws Exception {
		duplicate = new DuplicateChar();
	}

	@Test
	public void removingDuplicateTest() {
		assertEquals("heworld", duplicate.removing_Duplicate("helloworld"));
	}

	@Test
	public void removingDuplicateTestOnNull() {
		assertEquals("Null is not allowed", duplicate.removing_Duplicate(null));
	}

}
