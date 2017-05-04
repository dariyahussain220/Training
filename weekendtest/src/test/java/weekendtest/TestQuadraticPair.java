package weekendtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import weekendtest.QuadraticPair;

public class TestQuadraticPair {

	QuadraticPair pair = null;

	@Before
	public void setUp() throws Exception {
		pair = new QuadraticPair();
	}

	@Test
	public void testQuadPairs() {
		QuadraticPair pair2 = pair.solveQuadratic(1, 5, 6);
		assertEquals(-2, pair2.getX(), 0);
		assertEquals(-3, pair2.getY(), 0);
	}

	@Test
	public void testNanPairs() {
		QuadraticPair pair2 = pair.solveQuadratic(10, -5, 2);
		assertEquals(Double.NaN, pair2.getX(), 0);
		assertEquals(Double.NaN, pair2.getY(), 0);
	}

	@Test
	public void testZeroPais() {
		QuadraticPair pair2 = pair.solveQuadratic(0, 0, 0);
		assertEquals(0, pair2.getX(), 0);
		assertEquals(0, pair2.getY(), 0);
	}
}
