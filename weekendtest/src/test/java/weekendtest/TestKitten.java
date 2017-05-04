package weekendtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import weekendtest.Kitten;
import weekendtest.Person;

public class TestKitten {

	Kitten kt = null;

	@Before
	public void setUp() throws Exception {

		kt = new Kitten("OmniWyse", new Person("Raja Reddy"));
	}

	@Test
	public void testHaveBirthday() {
		for (int i = 0; i < 15; i++)
			kt.haveBirthday();
		assertEquals(15, kt.getAge());
	}

	@Test
	public void testString() {
		kt.haveBirthday();
		assertEquals("OmniWyse is 1 and belongs to Raja Reddy", kt.toString());
	}

	@Test
	public void testAgeZero() {
		assertEquals(0, kt.getAge());
	}
}
