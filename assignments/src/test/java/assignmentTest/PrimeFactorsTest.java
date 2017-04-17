package assignmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignments.PrimeFactors;

public class PrimeFactorsTest {

	PrimeFactors factors = null;

	@Before
	public void setUp() throws Exception {
		factors = new PrimeFactors();
	}

	@Test
	public void primeFactorTest() {
		assertEquals("3 23", factors.findingPrimefactors(69));
	}

	@Test
	public void nonPrimeFactorTest() {
		assertEquals("Do not enter 0 or 1", factors.findingPrimefactors(0));
	}
}
