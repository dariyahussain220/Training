package fridaytest2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTraingle {

	Traingle traingle=null;
	@Before
	public void setUp() throws Exception {
		traingle=new Traingle(4, 5, 3);
	}

	@Test
	public void testIsTraingle() {
		assertEquals(true, traingle.isTraingle());
	}
	@Test
	public void testNonTraingle(){
		traingle=new Traingle(4,5,10);
		assertEquals(false, traingle.isTraingle());
	}
	@Test
	public void testAngle(){
		assertEquals(53.13,traingle.getAngle(4),0.01);
	}
}
