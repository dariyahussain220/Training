package weekendtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import weekendtest.Quad;

public class TestQuad {

	Quad pair = null;

	@Before
	public void setUp() throws Exception {
		pair = new Quad();
	}

	@Test
	public void testNaNPairs() {

		Quad pair2 = pair.solveBiquadratic(1, 5, 6);
		assertEquals(Double.NaN, pair2.getX1(), 0);
		assertEquals(Double.NaN, pair2.getX2(), 0);
		assertEquals(Double.NaN, pair2.getX3(), 0);
		assertEquals(Double.NaN, pair2.getX4(), 0);
	}

	@Test
	public void testQuadPairs() {
		Quad pair2 = pair.solveBiquadratic(2, -7, 1);
		assertEquals(3, pair2.getX1(), 0.67);// 3.6610278
		assertEquals(-3, pair2.getX2(), 0.67);
		assertEquals(1, pair2.getX3(), 0.3);// 7-6.4031242
		assertEquals(-1, pair2.getX4(), 0.3);
	}

	@Test
	public void testZeroPairs() {

		Quad pair2 = pair.solveBiquadratic(0, 0, 0);
		assertEquals(0, pair2.getX1(), 0);
		assertEquals(0, pair2.getX2(), 0);
		assertEquals(0, pair2.getX3(), 0);
		assertEquals(0, pair2.getX4(), 0);
	}

}
