package weekendtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import weekendtest.Bicycle;

public class TestBicycle {

	Bicycle obj, obj2 = null;

	@Before
	public void setUp() throws Exception {
		obj = new Bicycle(10);
		obj2 = new Bicycle();
	}

	@Test
	public void testisMoving() {
		assertEquals(true, obj.isMoving());
		assertEquals(false, obj2.isMoving());
	}

	@Test
	public void testincreseSpeed() {
		obj.increseSpeed();
		assertEquals(11, obj.currentSpeed);
		obj2.increseSpeed();
		assertEquals(1, obj2.currentSpeed);
	}

	@Test
	public void testdecreseSpeed() {
		obj.decreseSpeed();
		assertEquals(9, obj.currentSpeed);
		obj2.decreseSpeed();
		assertEquals(1, obj2.currentSpeed);

	}
}
